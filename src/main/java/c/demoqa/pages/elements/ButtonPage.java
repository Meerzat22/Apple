package c.demoqa.pages.elements;

import c.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends BasePage {

    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickBtn;

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickBtn;

    @FindBy(xpath = "//button[text()='Click Me']")
    private WebElement clickMeBtn;

    public ButtonPage doubleClick(){
        elementActions.doubleClick(doubleClickBtn);
        return this;
    }

    public ButtonPage rightClick(){
        elementActions.rightClick(rightClickBtn);
        return this;
    }
}
