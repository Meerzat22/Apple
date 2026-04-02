package c.demoqa.pages.alertsFrameWindow;

import c.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    @FindBy(id = "alertButton")
    private WebElement alertBtn;

    @FindBy(id = "timerAlertButton")
    private WebElement timeAlertBtn;

    @FindBy(id = "confirmButton")
    private WebElement confirmBtn;

    @FindBy(id = "promtButton")
    private WebElement promtBtn;

    public AlertsPage clickAlertBtn(){
        elementActions.clickButton(alertBtn);
        return this;
    }

    public AlertsPage clickTimeAlertBtn(){
        elementActions.clickButton(timeAlertBtn);
        return this;
    }

    public AlertsPage clickConfirmBtn(){
        elementActions.clickButton(confirmBtn);
        return this;
    }

    public AlertsPage clickPromBtn(){
        elementActions.clickButton(promtBtn);
        return this;
    }

}
