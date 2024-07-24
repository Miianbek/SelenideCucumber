package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {

    public SelenideElement fullName=$(By.id("userName"));
    public SelenideElement email=$(By.xpath("//input[@id='userEmail']"));
    public SelenideElement currentAddress=$("#currentAddress");
    public SelenideElement permanentAddress=$("#permanentAddress");
    public SelenideElement submit=$("#submit");



}
