import by.itacademy.polina.sokolova.taf.sites.TripadvisorPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TripadvisorPageTest {
    @Test
    public void loginWithEmptyEmailPasswordInputs(){
        TripadvisorPage page = new TripadvisorPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.com/");

        WebElement buttonSignin = driver.findElement(By.xpath(page.buttonSigninXpath));
        buttonSignin.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ssoButtons']/button/span[1]")));

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.clear();

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.clear();

        WebElement buttonLogIn = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogIn.click();

        driver.quit();
    }

    @Test
    public void LoginWithInvalidEmail(){
        TripadvisorPage page = new TripadvisorPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.com/");

        WebElement buttonSignin = driver.findElement(By.xpath(page.buttonSigninXpath));
        buttonSignin.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ssoButtons']/button/span[1]")));

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("email");

        WebElement buttonLogIn = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogIn.click();

        driver.quit();

    }

    @Test
    public void loginWithValidEmailEmptyPassword(){
        TripadvisorPage page = new TripadvisorPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.com/");

        WebElement buttonSignin = driver.findElement(By.xpath(page.buttonSigninXpath));
        buttonSignin.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ssoButtons']/button/span[1]")));

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.clear();

        WebElement buttonLogIn = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogIn.click();

        driver.quit();
    }

    @Test
    public void loginWithValidEmailAnyPassword(){
        TripadvisorPage page = new TripadvisorPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.com/");

        WebElement buttonSignin = driver.findElement(By.xpath(page.buttonSigninXpath));
        buttonSignin.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ssoButtons']/button/span[1]")));

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPassword.sendKeys("123Qwe");

        WebElement buttonLogIn = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogIn.click();

        driver.quit();
    }



}

