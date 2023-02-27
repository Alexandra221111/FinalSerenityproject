package Pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElementFacade usernameField;

    @FindBy(id =  "password")
    private WebElementFacade passwordField;

    @FindBy(id = "submit")
    private WebElementFacade loginButton;

    public void setUsernameField(String value){
       setUsernameField (value);
    }

    public void setPasswordField(String value){
        setPasswordField(value);
    }

    public void clickLoginButton(){
        clickLoginButton();
    }

}
