package co.com.choucair.technicaltest.questions;
import co.com.choucair.technicaltest.userinterface.UTestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;


public class Verify implements Question<Boolean> {

    public static Verify SignUp() {
        return new Verify();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        /*Sign up confirmation will be determined by the captcha's visibility, since it pops into the frame once the process has been completed,
        since selenium can't automate captcha*/
        return Visibility.of(UTestSignUpPage.CAPTCHA_FRAME).viewedBy(actor).asBoolean();
    }
}
