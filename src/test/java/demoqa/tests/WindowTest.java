package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("UI")
public class WindowTest extends BaseTest {

    @Test
    void windowTest(){
        driver.navigate().to("https://demoqa.com/browser-windows");
        windowPage.clickTabBtn();
        windowPage.clickTabBtn();
        browserHelper.switchToWindow(2);
        browserHelper.switchToParent();
    }
}
