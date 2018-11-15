package com.usmanhussain.cayenne.interactors;

import com.usmanhussain.habanero.framework.page.PageDefinition;
import com.usmanhussain.habanero.framework.page.PageInteractor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoBaseInteractor<T extends PageDefinition> extends PageInteractor<T> {

    public DemoBaseInteractor(T pageDefinition) {
        super(pageDefinition);
    }

    protected void click(WebElement button) {
        waitUntilElementClickable(button);
        new Actions(getDriver()).moveToElement(button).click().build().perform();
    }

    protected void sendText(WebElement element, String txt) {
        waitUntilElementClickable(element);
        element.sendKeys(txt);
    }

}
