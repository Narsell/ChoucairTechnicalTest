package co.com.choucair.technicaltest.tasks;

import co.com.choucair.technicaltest.model.SignUpData;
import co.com.choucair.technicaltest.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SignUp implements Task {

    public SignUpData signUpData;

    public SignUp(SignUpData signUpData) {
        this.signUpData = signUpData;
    }

    public static SignUp user(SignUpData signUpData) {
        return Tasks.instrumented(SignUp.class, signUpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UTestSignUpPage.SIGNUP_BUTTON),
                //Step 1
                Enter.theValue(signUpData.getStrFirstName()).into(UTestSignUpPage.FIRSTNAME_INPUT),
                Enter.theValue(signUpData.getStrLastName()).into(UTestSignUpPage.LASTNAME_INPUT),
                Enter.theValue(signUpData.getStrEmail()).into(UTestSignUpPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(signUpData.getStrBirthDateMonth()).from(UTestSignUpPage.BIRTH_MONTH_SELECTOR),
                SelectFromOptions.byVisibleText(signUpData.getStrBirthDateDay()).from(UTestSignUpPage.BIRTH_DAY_SELECTOR),
                SelectFromOptions.byVisibleText(signUpData.getStrBirthDateYear()).from(UTestSignUpPage.BIRTH_YEAR_SELECTOR),
                Click.on(UTestSignUpPage.STAGE_1_BUTTON),
                //Step 2
                Enter.theValue(signUpData.getStrCity()).into(UTestSignUpPage.CITY_INPUT),
                Click.on(UTestSignUpPage.CITY_OPTION),
                Enter.theValue(signUpData.getStrZipCode()).into(UTestSignUpPage.ZIP_INPUT),
                Click.on(UTestSignUpPage.COUNTRY_SELECTOR),
                WaitUntil.the(UTestSignUpPage.COUNTRY_INPUT, isVisible()),
                Enter.theValue(signUpData.getStrCountry()).into(UTestSignUpPage.COUNTRY_INPUT).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.STAGE_2_BUTTON),
                //Step 3
                Click.on(UTestSignUpPage.COMPUTER_SELECTOR),
                Enter.theValue(signUpData.getStrOSType()).into(UTestSignUpPage.COMPUTER_INPUT).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.VERSION_SELECTOR),
                Enter.theValue(signUpData.getStrOSVersion()).into(UTestSignUpPage.VERSION_INPUT).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.LANG_SELECTOR),
                Enter.theValue(signUpData.getStrOSLanguage()).into(UTestSignUpPage.LANG_INPUT).thenHit(Keys.ENTER),

                Click.on(UTestSignUpPage.PHONE_BRAND_SELECTOR),
                Enter.theValue(signUpData.getStrPhoneBrand()).into(UTestSignUpPage.PHONE_BRAND_INPUT).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.PHONE_MODEL_SELECTOR),
                Enter.theValue(signUpData.getStrPhoneModel()).into(UTestSignUpPage.PHONE_MODEL_INPUT).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.PHONE_OS_SELECTOR),
                Enter.theValue(signUpData.getStrPhoneOS()).into(UTestSignUpPage.PHONE_OS_INPUT).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.STAGE_3_BUTTON),
                //Step 4
                Enter.theValue(signUpData.getStrPassword()).into(UTestSignUpPage.PASSWORD_INPUT),
                Enter.theValue(signUpData.getStrPassword()).into(UTestSignUpPage.CONFIRM_PWD_INPUT),
                Click.on(UTestSignUpPage.CHECKBOX_COC),
                Click.on(UTestSignUpPage.CHECKBOX_PSP),
                Click.on(UTestSignUpPage.FINISH_BUTTON)

        );
    }
}
