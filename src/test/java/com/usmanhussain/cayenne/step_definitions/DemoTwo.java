package com.usmanhussain.cayenne.step_definitions;

import com.usmanhussain.habanero.context.TestContext;
import com.usmanhussain.habanero.framework.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class DemoTwo extends StepDefs {

    public DemoTwo(TestContext context) {
        super(context);
    }

    @Then("^four$")
    public void four() throws Throwable {
        throw new PendingException();
    }

}
