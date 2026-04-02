package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
@Tag("UI")
public class AmazonTest extends BaseTest{

    @Test
    void amazonTest(){
//        driver.get("https://www.amazon.com/");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone" + Keys.RETURN);
        driver.get("https://www.amazon.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        search.sendKeys("Iphone" + Keys.ENTER);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        List<WebElement> brands = driver.findElements(By.cssSelector("#brandsRefinements ul li a "));
        for(WebElement brand : brands){
            brand.click();
        }//чтобы кликнул все бренды
    }
}
