package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class SelenideElementActions {

    public SelenideElementActions  click (SelenideElement element) {
        element.shouldBe(Condition.visible).click();
        return this;
    }

    public  SelenideElementActions sendKeys(SelenideElement element, String txt) {
        element.shouldBe(Condition.visible).setValue(txt);
        return this;
    }
}
