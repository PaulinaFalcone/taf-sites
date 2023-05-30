package by.itacademy.polina.sokolova.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    DominosPage dominosPage;
    DominosStep dominosStep;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        dominosPage = new DominosPage(driver);
        driver.get(dominosPage.baseURL);
        dominosStep = new DominosStep(driver);
    }

    @Test
    public void LoginWithInvalidEmailAnyPassword(){
        dominosStep.fillLoginForm("email", Util.generatePassword();
    }

    @Test
    public void LoginWithValidEmailAnyPassword() {
        dominosStep.fillLoginForm(Util.generateEmail(), Util.generatePassword());
    }
    @AfterEach
    public void tearsDown(){
        driver.quit();
    }
}
