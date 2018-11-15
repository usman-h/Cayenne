package com.usmanhussain.cayenne.pages;

import com.usmanhussain.habanero.context.TestContext;
import com.usmanhussain.habanero.framework.page.PageDefinition;
import org.openqa.selenium.WebElement;

public class DemoPageDefinition extends PageDefinition {

    public DemoPageDefinition(TestContext context) {
        super(context);
    }

    public WebElement elementID() {
        return getElementById("LocatorGoesHere");
    }

    public WebElement elementXPath() {
        return getElementByPath("//Locator Goes Here");
    }

    public WebElement elementCssSelector() {
        return getElementByCSS("Locator Goes Here");
    }

}
