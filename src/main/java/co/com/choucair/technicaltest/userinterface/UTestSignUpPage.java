package co.com.choucair.technicaltest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage {


    public static final Target SIGNUP_BUTTON = Target.the("Button triggers the sign up sequence")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    //Step 1: About yourself
    public static final Target FIRSTNAME_INPUT = Target.the("First name input field")
            .located(By.id("firstName"));
    public static final Target LASTNAME_INPUT = Target.the("Last name input field")
            .located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email input field")
            .located(By.id("email"));
    public static final Target BIRTH_DAY_SELECTOR = Target.the("Birth date day selector")
            .located(By.xpath("//div[@id='birthDate']//select[@aria-label='Birth day']"));
    public static final Target BIRTH_MONTH_SELECTOR = Target.the("Birth date month selector")
            .located(By.xpath("//div[@id='birthDate']//select[@aria-label='Birth month']"));
    public static final Target BIRTH_YEAR_SELECTOR = Target.the("Birth date year selector")
            .located(By.xpath("//div[@id='birthDate']//select[@aria-label='Birth year']"));
    public static final Target STAGE_1_BUTTON = Target.the("Button that takes us into the second sign up step")
            .located(By.xpath("//a[@class='btn btn-blue']//span[contains(text(), 'Next: Location')]"));

    //Step 2: Add your address
    public static final Target CITY_INPUT = Target.the("Input field that displays a dropdown list of cities based on our input")
            .located(By.id("city"));
    public static final Target CITY_OPTION = Target.the("First item on the dropdown to be selected")
            .located(By.xpath("//div[@class='pac-container pac-logo']//div[@class='pac-item'][1]"));
    public static final Target ZIP_INPUT = Target.the("Zip code input")
            .located(By.id("zip"));
    public static final Target COUNTRY_SELECTOR = Target.the("Dropdown that displays the list of countries")
            .located(By.name("countryId"));
    public static final Target COUNTRY_INPUT = Target.the("Dropdown that displays the list of countries")
            .located(By.xpath("//div[@name='countryId']//input[@placeholder='Select a country']"));
    public static final Target STAGE_2_BUTTON = Target.the("Button that takes us into the third sign up step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']//span[contains(text(), 'Next: Devices')]"));

    //Step 3: Devices
    public static final Target COMPUTER_SELECTOR = Target.the("Dropdown that displays the list of computers")
            .located(By.name("osId"));
    public static final Target COMPUTER_INPUT = Target.the("Input field for computer type")
            .located(By.xpath("//div[@name='osId']//input[@placeholder='Select OS']"));
    public static final Target VERSION_SELECTOR = Target.the("Dropdown that displays the list of computer versions")
            .located(By.name("osVersionId"));
    public static final Target VERSION_INPUT = Target.the("Input field for computer version")
            .located(By.xpath("//div[@name='osVersionId']//input[@placeholder='Select a Version']"));
    public static final Target LANG_SELECTOR = Target.the("Dropdown that displays the list of languages available")
            .located(By.name("osLanguageId"));
    public static final Target LANG_INPUT = Target.the("Input field for computer language")
            .located(By.xpath("//div[@name='osLanguageId']//input[@placeholder='Select OS language']"));

    public static final Target PHONE_BRAND_SELECTOR = Target.the("Dropdown that displays the list of phone brands")
            .located(By.name("handsetMakerId"));
    public static final Target PHONE_BRAND_INPUT = Target.the("Input field for phone brands")
            .located(By.xpath("//div[@name='handsetMakerId']//input[@placeholder='Select Brand']"));
    public static final Target PHONE_MODEL_SELECTOR = Target.the("Dropdown that displays the list of phone models")
            .located(By.name("handsetModelId"));
    public static final Target PHONE_MODEL_INPUT = Target.the("Input field for phone models")
            .located(By.xpath("//div[@name='handsetModelId']//input[@placeholder='Select a Model']"));
    public static final Target PHONE_OS_SELECTOR = Target.the("Dropdown that displays the list of phone OS")
            .located(By.name("handsetOSId"));
    public static final Target PHONE_OS_INPUT = Target.the("Input field for phone OS")
            .located(By.xpath("//div[@name='handsetOSId']//input[@placeholder='Select OS']"));
    public static final Target STAGE_3_BUTTON = Target.the("")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']//span[contains(text(), 'Next: Last Step')]"));

    //Step 4: last step

    public static final Target PASSWORD_INPUT = Target.the("Password input field")
            .located(By.id("password"));
    public static final Target CONFIRM_PWD_INPUT = Target.the("Confirm password input field")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_COC = Target.the("Checkbox to agree to Code of Conduct and Terms of Use")
            .located(By.xpath("//label//a[@href='/terms-and-conditions']/../span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CHECKBOX_PSP = Target.the("Checkbox to agree to the Privacy & Security Policy")
            .located(By.xpath("//label//a[@href='/privacy-policy']/../span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target FINISH_BUTTON = Target.the("Button that finishes the sign up process")
            .located(By.id("laddaBtn"));

    public static final Target CAPTCHA_FRAME = Target.the("Captcha frame that pops into the browser once the sign up form has been filled")
            .located(By.xpath("//iframe[@title='recaptcha challenge']"));


}
