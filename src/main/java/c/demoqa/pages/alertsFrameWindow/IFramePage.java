package c.demoqa.pages.alertsFrameWindow;

import c.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage extends BasePage {

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeading;

    public String getSampleHeadingText(){
        return sampleHeading.getText();
    }
}
