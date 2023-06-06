package test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
    String actualResult1;
    String actualResult2;

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
        pizzatempoPage.getResultErrorText();
        Assertions.assertEquals(actualResult1, "Ошибка");
    }

    @Test
    public void loginWithInvalidEmail() {

       pizzaTempoStep.fillLoginForm("email", "");
        pizzatempoPage.getResultErrorText();
        Assertions.assertEquals(actualResult1, "Ошибка");
    }

    @Test
    public void loginWithEmptyEmailAnyPassword() {

        pizzaTempoStep.fillLoginForm("", Util.generatePassword());
        pizzatempoPage.getResultErrorText();
        Assertions.assertEquals(actualResult1, "Ошибка");
    }

    @Test
    public void loginWithValidEmailEmptyPassword() {

       pizzaTempoStep.fillLoginForm(Util.generateEmail(), "");
        pizzatempoPage.getResultErrorText();
        Assertions.assertEquals(actualResult1, "Ошибка");

    }

    @Test
    public void loginWithValidEmailAnyPassword() {

       pizzaTempoStep.fillLoginForm(Util.generateEmail(), Util.generatePassword());
       pizzatempoPage.getResultSuccessEntranceText();
        Assertions.assertEquals(actualResult2, "Алина");

    }
    @AfterEach
    public void tearsDown(){
        driver.quit();
    }
}