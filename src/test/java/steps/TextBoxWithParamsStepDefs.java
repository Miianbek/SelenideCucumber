package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TextBoxPage;

public class TextBoxWithParamsStepDefs {

    TextBoxPage textBoxPage= new TextBoxPage();
    @When("user  fill up  fullName {string}")
    public void user_fill_up_full_name(String fullName) {
        textBoxPage.fullName.sendKeys(fullName);


    }
    @When("user should fill up email {string}")
    public void user_should_fill_up_email(String email) {
        textBoxPage.email.sendKeys(email);

    }
    @When("user should fill up  current address {string}")
    public void user_should_fill_up_current_address(String currentAddress) {
        textBoxPage.currentAddress.sendKeys(currentAddress);


    }
    @When("user should fill up  permanent address {string}")
    public void user_should_fill_up_permanent_address(String permanentAddress) {
        textBoxPage.permanentAddress.sendKeys(permanentAddress);


    }
    @Then("user should see {string}")
    public void user_should_see(String result) {
        System.out.println(result);


    }
    @Then("user age is {int}")
    public void user_age_is(Integer age) {

    }
}
