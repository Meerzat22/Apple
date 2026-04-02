package c.demoqa.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {

    public CheckBox(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
