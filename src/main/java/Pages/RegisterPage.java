package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage {

    @FindBy( name ="reg_email")
    private WebElementFacade EmailField;

    @FindBy( id = "Password")
    private WebElementFacade passwordField;


    @FindBy(id = "Register")
    private WebElementFacade registerButton;

    public RegisterPage(WebElementFacade emailField) {
        EmailField = emailField;
    }


    public void setEmailField(WebElementFacade emailField) {
        this.EmailField = emailField;
    }

    public void setPasswordField(WebElementFacade passwordField) {
        this.passwordField = passwordField;
    }


    public void setRegisterButton(WebElementFacade registerButton) {
        this.registerButton = registerButton;
    }
}
