package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy(css = "My Account")
    private WebElementFacade accountButton;

    @FindBy(css = "submit")
    private WebElementFacade loginLink;

    public void clickOnAccountButton(){
        clickOnAccountButton();
    }

    public void clickOnLoginLink(){
        clickOnLoginLink();
    }


}
