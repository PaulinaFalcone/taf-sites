package by.itacademy.polina.sokolova.taf.sites;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        driver.get(pizzatempoPage.baseURL);
    }

    @Test
    public void loginWithEmptyEmailEmptyPassword(){

        pizzatempoPage.clickbuttonLogin();

    }

    @Test
    public void loginWithInvalidEmail() {

        pizzatempoPage.sendKeysInputEmail("email");
        pizzatempoPage.clickbuttonLogin();

    }

    @Test
    public void loginWithEmptyEmailAnyPassword() {

        pizzatempoPage.sendKeysInputPassword("123Qwe");
        pizzatempoPage.clickbuttonLogin();


    }

    @Test
    public void loginWithValidEmailEmptyPassword() {

        pizzatempoPage.sendKeysInputEmail("paulinasokolova2020@gmail.com");
        pizzatempoPage.clickbuttonLogin();


    }

    @Test
    public void loginWithValidEmailAnyPassword() {

        pizzatempoPage.sendKeysInputEmail("paulinasokolova2020@gmail.com");
        pizzatempoPage.sendKeysInputPassword("123Qwe");

        pizzatempoPage.clickbuttonLogin();

    }
    @AfterEach
    public void tearsDown(){
        driver.quit();
    }
}