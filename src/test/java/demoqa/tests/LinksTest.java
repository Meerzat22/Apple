package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
@Tag("UI")
public class LinksTest extends BaseTest {

    @Test
    void linksTest(){
        driver.navigate().to("https://demoqa.com/links");
        String tab = driver.getWindowHandle();
        List<WebElement> allButtons = linksPage.getAllButtons();
        ArrayList<String> newTabLinks = new ArrayList<>();
        ArrayList<String> textLinks = new ArrayList<>();

        for(WebElement el: allButtons){
            int beforeClick = driver.getWindowHandles().size();
            elementActions.clickButton(el);
            driver.switchTo().window(tab);
            int afterClick = driver.getWindowHandles().size();
            if(afterClick > beforeClick){
                newTabLinks.add(el.getText());
            }else {
                textLinks.add(el.getText());
            }
        }
        System.out.println(newTabLinks);
        System.out.println(textLinks);
    }
}
