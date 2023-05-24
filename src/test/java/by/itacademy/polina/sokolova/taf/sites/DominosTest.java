package by.itacademy.polina.sokolova.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosTest {
    ChromeDriver driver;
    DominosPage dominosPage;
    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        dominosPage = new DominosPage(driver);
        driver.get(dominosPage.baseURL);
    }

    @Test
    public void LoginWithInvalidEmailAnyPassword(){

        dominosPage.clickButtonSignin();
        dominosPage.sendKeysInputEmail("email");
        dominosPage.sendKeysInputPassword("123Qwe");
        dominosPage.clickButtonLogin();
    }



    @Test
    public void LoginWithValidEmailAnyPassword() {

        dominosPage.clickButtonSignin();
        dominosPage.sendKeysInputEmail("paulina@gmail.com");
        dominosPage.sendKeysInputPassword("123Qwe");
        dominosPage.clickButtonLogin();

    }
    @AfterEach
    public void tearsDown(){
        driver.quit();
    }
}
