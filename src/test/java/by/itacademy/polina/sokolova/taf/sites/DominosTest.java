package by.itacademy.polina.sokolova.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DominosTest {
    @Test
    public void LoginWithInvalidEmailAnyPassword() {
        DominosPage page = new DominosPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dominos.by/");

        WebElement buttonSignin = driver.findElement(By.xpath(page.buttonSigninXpath));
        buttonSignin.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("email");

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.sendKeys("123Qwe");

        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLoginXpath));
        buttonLogin.click();

        driver.quit();


    }

    @Test
    public void LoginWithValidEmailAnyPassword() {
        DominosPage page = new DominosPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dominos.by/");

        WebElement buttonSignin = driver.findElement(By.xpath(page.buttonSigninXpath));
        buttonSignin.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.sendKeys("123Qwe");

        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLoginXpath));
        buttonLogin.click();

        driver.quit();

    }
}
