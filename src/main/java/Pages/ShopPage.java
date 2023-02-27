package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShopPage extends BasePage{

    @FindBy(css = "shop")
    private WebElementFacade shopField;

    public void setShopField(WebElementFacade shopField) {
        this.shopField = shopField;
    }

}
