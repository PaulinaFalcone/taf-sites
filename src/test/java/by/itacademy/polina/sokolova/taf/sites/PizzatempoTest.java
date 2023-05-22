package by.itacademy.polina.sokolova.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    @Test
    public void loginWithEmptyEmailEmptyPassword() {
        PizzatempoPage page = new PizzatempoPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");

        WebElement login = driver.findElement(By.xpath(page.buttonLoginXpath));
        login.click();

        driver.quit();
    }

    @Test
    public void loginWithInvalidEmail() {
        PizzatempoPage page = new PizzatempoPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("email");

        WebElement login = driver.findElement(By.xpath(page.buttonLoginXpath));
        login.click();

        driver.quit();
    }

    @Test
    public void loginWithEmptyEmailAnyPassword() {
        PizzatempoPage page = new PizzatempoPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.sendKeys("123Qwe");

        WebElement login = driver.findElement(By.xpath(page.buttonLoginXpath));
        login.click();

        driver.quit();
    }

    @Test
    public void loginWithValidEmailEmptyPassword() {
        PizzatempoPage page = new PizzatempoPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement login = driver.findElement(By.xpath(page.buttonLoginXpath));
        login.click();

        driver.quit();
    }

    @Test
    public void loginWithValidEmailAnyPassword() {
        PizzatempoPage page = new PizzatempoPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.sendKeys("123Qwe");

        WebElement login = driver.findElement(By.xpath(page.buttonLoginXpath));
        login.click();

        driver.quit();
    }
}