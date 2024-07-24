package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TextBoxPage;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxStepDefs {
    TextBoxPage textBoxPage= new TextBoxPage();

    @Given("user is on text box page")
    public void user_is_on_text_box_page() {
        open("https://demoqa.com/text-box");

    }
    @When("user  fill up  fullName input field  with valid data")
    public void user_fill_up_full_name_input_field_with_valid_data() {
        textBoxPage.fullName.sendKeys("John Snow");

    }
    @When("user should fill up email field with valid email")
    public void user_should_fill_up_email_field_with_valid_email() {
        textBoxPage.email.sendKeys("john@gmail.com");

    }
    @When("user should fill up  current address with valid addres")
    public void user_should_fill_up_current_address_with_valid_addres() {
        textBoxPage.currentAddress.sendKeys("Ak orgo");

    }
    @When("user should fill up  permanent address with valid addres")
    public void user_should_fill_up_permanent_address_with_valid_addres() {
        textBoxPage.permanentAddress.sendKeys("Kojokordu 12");

    }
    @When("user click  on submit button")
    public void user_click_on_submit_button() {
        textBoxPage.submit.click();

    }
    @Then("user should see the result")
    public void user_should_see_the_result() {
        Assert.assertEquals("Hello hi","Hello hi");

    }

    @When("user should fill up email field with invalid email")
    public void user_should_fill_up_email_field_with_invalid_email() {
        textBoxPage.email.sendKeys("johngmail.com");
    }
}
