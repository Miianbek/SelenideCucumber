package pages.orange;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {

    public SelenideElement userNameInput=$(By.name("username"));
    public SelenideElement passwordInput=$(By.name("passwordф"));
    public SelenideElement loginBtn=$x("//button[normalize-space()='Login']");

    public LoginPage inputUserName(String userName) {
        selenideElementActions.sendKeys(userNameInput,userName);
        return this;

    }
    public LoginPage inputPassword(String password) {
        selenideElementActions.sendKeys(passwordInput,password);
        return this;
    }
    public LoginPage clickLogin() {
        selenideElementActions.click(loginBtn);
        return this;
    }
}
