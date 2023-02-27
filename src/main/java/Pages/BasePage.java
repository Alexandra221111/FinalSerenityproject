package Pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

    public int getIntFromPrice(String price) {

        int i = Integer.parseInt(price
                .replaceAll(",", "")
                .replaceAll(" RON", ""));

                return i;

    }
}




