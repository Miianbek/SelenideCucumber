package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.orange.DashboardPage;
import pages.orange.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class OrangeLoginStepDefs {

    LoginPage loginPage;

    DashboardPage dashboardPage;

    @Before
    public void setUp () {
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        System.out.println("Hello World");
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("user should enter login {string}")
    public void user_should_enter_login(String userName) {
        loginPage.inputUserName(userName);

    }
    @When("user should enter password {string}")
    public void user_should_enter_password(String password) {
        loginPage.inputPassword(password);

    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLogin();

    }
    @Then("user should successfully logged in")
    public void user_should_successfully_logged_in() {
        Assertions.assertEquals("Dashboard",dashboardPage.dashboardTxt.getText());

    }
}
