package by.itacademy.polina.sokolova.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    private ChromeDriver driver;
    private String inputEmailName = "astroauth_login";
    private String inputPasswordName = "astroauth_pass";
    private String buttonLoginName = "astroauth_submit";
    String baseURL = "https://www.pizzatempo.by/";

    public PizzatempoPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickbuttonLogin(){
        WebElement buttonlogin = driver.findElement(By.name(buttonLoginName));
        buttonlogin.click();
    }
    public void sendKeysInputEmail(String value){
        WebElement inputEmail = driver.findElement(By.name(inputEmailName));
        inputEmail.sendKeys(value);
    }
    public void  sendKeysInputPassword(String value){
        WebElement inputPassword = driver.findElement(By.name(inputPasswordName));
        inputPassword.sendKeys(value);
    }
}

