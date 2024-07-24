package pages.orange;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage extends BasePage{
    public SelenideElement dashboardTxt=$(By.tagName("h6"));


}
