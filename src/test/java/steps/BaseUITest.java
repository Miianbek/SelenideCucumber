package steps;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import utils.driver.Driver;

import static com.codeborne.selenide.Configuration.*;
import static config.ConfigurationManager.getAppConfig;

public class BaseUITest {


    @Before
    public void setUp(){
        browser=getAppConfig().browser();
        browserCapabilities= Driver.initBrowserCapabilities();
        browserSize="1920x1080";
        holdBrowserOpen=false;
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                byte[] screenshot= Selenide.screenshot((OutputType.BYTES));
                scenario.attach(screenshot,"image/png","screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.out.println(noSupportScreenshot.getMessage());
            }
        }
        Selenide.closeWebDriver();
    }


}
