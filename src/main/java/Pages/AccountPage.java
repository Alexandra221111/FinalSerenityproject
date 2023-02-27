package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(css = "admin")
    private WebElementFacade welcomeTextElement;

    public boolean isWelcomeText(String userName) {
        return welcomeTextElement.containsOnlyText("admin");
    }

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

    public void userIsLoggedIn(String userName){
        welcomeTextElement.shouldContainOnlyText("Hello, " + userName +" ");

    }
}