package c.demoqa.halpers;

import c.demoqa.drivers.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver = DriverManager.getDriver();

    public AlertHelper(){
        this.driver = driver;
    }

    private Alert getAlerts(){//проверяет появилась ли  Alert
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert(); // c html переключает на Alert
    }

    public void accept(){//принять
        getAlerts().accept();//accept Метод интерфейса Alert
    }

    public void dismiss(){
        getAlerts().dismiss();//
    }

    public AlertHelper sendKeys(String massage){
        getAlerts().sendKeys(massage);
        return this;
    }
}
