package by.itacademy.polina.sokolova.taf.sites;

import org.openqa.selenium.chrome.ChromeDriver;

public class DominosStep{
    DominosPage page;
    public DominosStep(ChromeDriver driver){
        page = new DominosPage(driver);
    }
    public void fillLoginForm (String name, String password){
        page.clickButtonSignin();
        page.sendKeysInputEmail(name);
        page.sendKeysInputPassword(password);
        page.clickButtonLogin();
    }
}
