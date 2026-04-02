package c.demoqa.pages;

import c.demoqa.drivers.DriverManager;
import c.demoqa.halpers.ElementActions;
import org.openqa.selenium.support.PageFactory;

abstract public class BasePage {

    protected ElementActions elementActions = new ElementActions();

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(),this);
    }
}
