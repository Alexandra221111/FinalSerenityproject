package Features;


import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest{


    public CartTest(WebDriver driver) {
        this.driver = driver;
    }


    @Test
    public void addToCartTest() {
        loginSteps.doLogin("admin", "parola11");

    }
}
