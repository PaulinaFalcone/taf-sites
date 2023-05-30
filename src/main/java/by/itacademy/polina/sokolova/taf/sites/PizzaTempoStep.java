package by.itacademy.polina.sokolova.taf.sites;
import org.openqa.selenium.chrome.ChromeDriver;


public class PizzaTempoStep {
    PizzatempoPage page;
    public PizzaTempoStep(ChromeDriver driver) {
        page = new PizzatempoPage(driver);
    }
    public void fillLoginForm(String name, String password){
        page.sendKeysInputEmail(name);
        page.sendKeysInputPassword(password);
        page.clickbuttonLogin();
    }
}
