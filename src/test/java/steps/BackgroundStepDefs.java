package steps;

import io.cucumber.java.en.Then;

public class BackgroundStepDefs {

    @Then("say Hello")
    public void say_hello() {
        System.out.println("Say hello");

    }

    @Then("say bye bye")
    public void say_bye_bye() {
        System.out.println("Say bye bye");

    }

    @Then("say not hello")
    public void say_not_hello() {
        System.out.println("Say not hello");

    }
}
