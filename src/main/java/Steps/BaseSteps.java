package Steps;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class BaseSteps {
    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void navigateToLoginPage() {
        homePage.clickOnLoginLink();
        homePage.clickOnAccountButton();

    }

    @Step
    public void typeUserEmail(String email) {
        loginPage.setUsernameField(email);
    }

    @Step
    public void typePassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void userIsLoggedIn(String userName) {
//        Assert.assertTrue(accountPage.isWelcomeText(userName));
//        Assert.assertEquals("Hello, " + userName + "!", accountPage.getWelcomeText());
        accountPage.userIsLoggedIn(userName);
    }
}
