package c.demoqa.halpers;

import c.demoqa.drivers.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class ElementActions {

    Actions actions = new Actions(DriverManager.getDriver());

    public ElementActions waitElementToBeClickable(WebElement element){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeVisible(WebElement element){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickButton (WebElement element){
        waitElementToBeClickable(element);
        scrollToElement(element);                                     //скрол
        element.click();
        return this;
    }

    public ElementActions inputText(WebElement element, String text){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.sendKeys(text);
        return this;
    }

    public ElementActions scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();//java script
        js.executeScript("arguments[0].scrollIntoView(true);",element); //до какого элемента наводить (вместо аргумента тот элемента параметра)
        return this;
    }

    public ElementActions selectByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
        return this;
    }

    public ElementActions selectByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
        return this;
    }

    public ElementActions doubleClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementToBeClickable(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public ElementActions rightClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementToBeClickable(element);
        actions.contextClick(element).perform();
        return this;
    }
}
