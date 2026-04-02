package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("UI")
public class ButtonsTest extends BaseTest {

    @Test
    void buttonClick(){
        driver.get("https://demoqa.com/buttons");
        buttonPage.doubleClick();
        buttonPage.rightClick();
    }
}
