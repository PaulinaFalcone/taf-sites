package step;
import org.openqa.selenium.chrome.ChromeDriver;
import page.PizzatempoPage;


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
