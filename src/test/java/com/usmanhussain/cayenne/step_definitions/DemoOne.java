package com.usmanhussain.cayenne.step_definitions;

import com.usmanhussain.cayenne.BaseStepDef;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoOne extends BaseStepDef {

    @Given("^one$")
    public void one() throws Throwable {
        throw new PendingException();
    }

    @When("^two$")
    public void two() throws Throwable {
        throw new PendingException();
    }

    @Then("^three$")
    public void three() throws Throwable {
        throw new PendingException();
    }

}
