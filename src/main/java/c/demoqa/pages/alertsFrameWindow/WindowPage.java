package c.demoqa.pages.alertsFrameWindow;

import c.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage {

    @FindBy(id = "tabButton")
    private WebElement tabBtn;

    @FindBy(id = "windowButton")
    private WebElement windowBtn;

    @FindBy(id = "messageWindowButton")
    private WebElement messageWindowBtn;

    public WindowPage clickTabBtn(){
        elementActions.clickButton(tabBtn);
        return this;
    }

    public WindowPage clickWindowBtn(){
        elementActions.clickButton(windowBtn);
        return this;
    }

    public WindowPage clickMessageWindowBtn(){
        elementActions.clickButton(messageWindowBtn);
        return this;
    }
}
