
package by.itacademy.polina.sokolova.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BookingTest {


    @Test
    public void loginWithEmptyEmailInput() {

        BookingPage page = new BookingPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='onetrust-policy-text']")));

        WebElement buttonAccept = driver.findElement(By.xpath(page.buttonAccept));
        buttonAccept.click();

        WebElement buttonLoginOrRegister = driver.findElement(By.xpath(page.buttonLoginOrRegisterXpath));
        buttonLoginOrRegister.click();

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        driver.quit();

    }

    @Test
    public void loginWithInvalidEmail() {
        BookingPage page = new BookingPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='onetrust-policy-text']")));

        WebElement buttonAccept = driver.findElement(By.xpath(page.buttonAccept));
        buttonAccept.click();

        WebElement buttonLoginOrRegister = driver.findElement(By.xpath(page.buttonLoginOrRegisterXpath));
        buttonLoginOrRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("email");

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogin.click();
        driver.quit();
    }

    @Test
    public void loginWithValidEmail() {
        BookingPage page = new BookingPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='onetrust-policy-text']")));

        WebElement buttonAccept = driver.findElement(By.xpath(page.buttonAccept));
        buttonAccept.click();

        WebElement buttonLoginOrRegister = driver.findElement(By.xpath(page.buttonLoginOrRegisterXpath));
        buttonLoginOrRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogin.click();
        driver.quit();
    }
    @Test
    public void loginWithValidEmailAndEmptyPassword() {
        BookingPage page = new BookingPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='onetrust-policy-text']")));

        WebElement buttonAccept = driver.findElement(By.xpath(page.buttonAccept));
        buttonAccept.click();

        WebElement buttonLoginOrRegister = driver.findElement(By.xpath(page.buttonLoginOrRegisterXpath));
        buttonLoginOrRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogin.click();
        driver.quit();
    }

    @Test
    public void loginWithValidEmailAndPassword() {
        BookingPage page = new BookingPage();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='onetrust-policy-text']")));

        WebElement buttonAccept = driver.findElement(By.xpath(page.buttonAccept));
        buttonAccept.click();

        WebElement buttonLoginOrRegister = driver.findElement(By.xpath(page.buttonLoginOrRegisterXpath));
        buttonLoginOrRegister.click();

        WebElement inputEmail = driver.findElement(By.xpath(page.inputEmailXpath));
        inputEmail.sendKeys("paulinasokolova2020@gmail.com");

        WebElement buttonContinueWitEmail = driver.findElement(By.xpath(page.buttonContinueWitEmailXpath));
        buttonContinueWitEmail.click();

        WebElement inputLogin = driver.findElement(By.xpath(page.buttonLogInXpath));
        inputLogin.sendKeys("123Qwe");

        WebElement buttonLogin = driver.findElement(By.xpath(page.buttonLogInXpath));
        buttonLogin.click();

        driver.quit();
    }

}

