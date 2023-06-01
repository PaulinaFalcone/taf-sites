package page;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {
    private ChromeDriver driver;
    private String buttonSigninXpath = "//div[3]/button";
    private String inputEmailName  = "//input[@name = 'email']";
    private String inputPasswordName = "//input[@name = 'password']";
    private String buttonLoginXpath = "//form/div/button";
    String baseURL = "https://dominos.by/";

    public DominosPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickButtonSignin() {
        WebElement buttonSignin = driver.findElement(By.xpath(buttonSigninXpath));
        buttonSignin.click();
    }

    public void sendKeysInputEmail(String value) {
        WebElement inputEmail = driver.findElement(By.name(inputEmailName));
        inputEmail.sendKeys(value);
    }

    public void sendKeysInputPassword(String value) {
        WebElement inputPassword = driver.findElement(By.name(inputPasswordName));
        inputPassword.sendKeys(value);
    }

    public void clickButtonLogin() {
        WebElement buttonSignin = driver.findElement(By.xpath(buttonSigninXpath));
        buttonSignin.click();
    }
}
