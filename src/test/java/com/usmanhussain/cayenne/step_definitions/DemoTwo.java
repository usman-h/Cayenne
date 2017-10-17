package com.usmanhussain.cayenne.step_definitions;

import com.usmanhussain.cayenne.BaseStepDef;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class DemoTwo extends BaseStepDef {

    @Then("^four$")
    public void four() throws Throwable {
        throw new PendingException();
    }

}
