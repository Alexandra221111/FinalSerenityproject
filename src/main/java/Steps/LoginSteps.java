package Steps;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends BaseSteps{



    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        typeUserEmail(email);
        typePassword(pass);
        clickLogin();
    }
}
