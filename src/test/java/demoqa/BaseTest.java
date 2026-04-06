package demoqa;

import c.demoqa.drivers.DriverManager;
import c.demoqa.halpers.AlertHelper;
import c.demoqa.halpers.BrowserHelper;
import c.demoqa.halpers.ElementActions;
import c.demoqa.halpers.IFrameHelper;
import c.demoqa.pages.Elements;
import c.demoqa.pages.alertsFrameWindow.AlertsPage;
import c.demoqa.pages.alertsFrameWindow.IFramePage;
import c.demoqa.pages.alertsFrameWindow.WindowPage;
import c.demoqa.pages.elements.ButtonPage;
import c.demoqa.pages.elements.LinksPage;
import c.demoqa.pages.elements.TextBoxPage;
import c.demoqa.pages.elements.WebTablesPage;
import c.demoqa.pages.forms.PracticeFormPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected static TextBoxPage textBoxPage;

    protected static PracticeFormPage practiceFormPage;
    protected static ButtonPage buttonPage;
    protected static AlertsPage alertsPage;
    protected static Elements elements;
    protected static LinksPage linksPage;
    protected static WindowPage windowPage;
    protected static IFramePage iFramePage;
    protected static WebTablesPage webTablesPage;

    protected static AlertHelper alertHelper;
    protected static BrowserHelper browserHelper;
    protected static IFrameHelper iFrameHelper;

    protected static ElementActions elementActions;

    @BeforeAll
    public static void setUpBrowser(){
        driver = DriverManager.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormPage = new PracticeFormPage();
        alertsPage = new AlertsPage();
        alertHelper = new AlertHelper();
        buttonPage = new ButtonPage();
        elements = new Elements();
        browserHelper = new BrowserHelper();
        linksPage = new LinksPage();
        elementActions = new ElementActions();
        windowPage = new WindowPage();
        //iFrameHelper = new IFrameHelper();
        iFramePage = new IFramePage();
        webTablesPage = new WebTablesPage();

    }

    @AfterAll
    public static void tearDown(){
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        DriverManager.closeDriver();
    }
}
