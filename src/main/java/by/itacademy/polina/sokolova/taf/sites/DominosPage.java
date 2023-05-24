package by.itacademy.polina.sokolova.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {
    public ChromeDriver driver;
    String buttonSigninXpath = "//div[1]/div/div[4]/div/div/div[3]/button/span/span[2]";
    String inputEmailXpath = "//form/div/div[1]/input";
    String inputPasswordXpath = "//form/div/div[2]/input";
    String buttonLoginXpath = "//form/div/button";
    String baseURL = "https://dominos.by/";

    public DominosPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickButtonSignin() {
        WebElement buttonSignin = driver.findElement(By.xpath(buttonSigninXpath));
        buttonSignin.click();
    }

    public void sendKeysInputEmail(String value) {
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailXpath));
        inputEmail.sendKeys(value);
    }

    public void sendKeysInputPassword(String value) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys(value);
    }

    public void clickButtonLogin() {
        WebElement buttonSignin = driver.findElement(By.xpath(buttonSigninXpath));
        buttonSignin.click();
    }
}
