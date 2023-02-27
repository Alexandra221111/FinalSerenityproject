package Features;


import Steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {



    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("admin");
        loginSteps.typePassword("parola11");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("admin");
    }
}
