package test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import page.PizzatempoPage;
import step.PizzaTempoStep;
import util.Util;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;
    PizzaTempoStep pizzaTempoStep;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get(pizzatempoPage.baseURL);
        pizzaTempoStep = new PizzaTempoStep(driver);
    }

    @Test
    public void loginWithEmptyData(){

        pizzaTempoStep.fillLoginForm("","");
    }

    @Test
    public void loginWithInvalidEmail() {

       pizzaTempoStep.fillLoginForm("email", "");
    }

    @Test
    public void loginWithEmptyEmailAnyPassword() {

        pizzaTempoStep.fillLoginForm("", Util.generatePassword());
    }

    @Test
    public void loginWithValidEmailEmptyPassword() {

       pizzaTempoStep.fillLoginForm(Util.generateEmail(), "");

    }

    @Test
    public void loginWithValidEmailAnyPassword() {

       pizzaTempoStep.fillLoginForm(Util.generateEmail(), Util.generatePassword();
    }
    @AfterEach
    public void tearsDown(){
        driver.quit();
    }
}