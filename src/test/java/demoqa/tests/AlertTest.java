package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UI")
public class AlertTest extends BaseTest {

    @Test
    void alertTest() {
        driver.get("https://demoqa.com/alerts");
        alertsPage.clickAlertBtn();
        alertHelper.accept();

        alertsPage.clickConfirmBtn();
        alertHelper.dismiss();

        alertsPage.clickPromBtn();
        alertHelper.sendKeys("m").accept();
    }
}
