package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("UI")
public class ElementsTest extends BaseTest {

    @Test
    void clickElementMenuTest(){
        // driver.navigate().to("https://demoqa.com/elements");
        browserHelper.open("https://demoqa.com/elements");
        elements.clickTextBoxPage();
        elements.clickCheckBoxPage();
        browserHelper.goBack();
        elements.clickCheckBoxPage();
        browserHelper.goBack();
        browserHelper.goForward();
        browserHelper.refreshPage();
        elements.clickDynamicPropertiesPage();
    }
}
