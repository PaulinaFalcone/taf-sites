package by.itacademy.polina.sokolova.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    private ChromeDriver driver;
    String inputEmailXpath = "//form/p[1]/input";
    String inputPasswordXpath = "//form/p[2]/input[1]";
    private String buttonLoginXpath = "//form/p[2]/input[2]";
    String baseURL = "https://www.pizzatempo.by/";

    public PizzatempoPage(ChromeDriver newDriver){
        driver = newDriver;
    }

    //methods
    public void clickbuttonLogin(){
        WebElement buttonlogin = driver.findElement(By.xpath(buttonLoginXpath));
        buttonlogin.click();
    }
    public void sendKeysInputEmail(String value){
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailXpath));
        inputEmail.sendKeys(value);
    }
    public void  sendKeysInputPassword(String value){
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys(value);
    }
}

