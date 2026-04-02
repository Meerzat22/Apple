package c.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements extends BasePage{

    @FindBy(xpath = "//span[text()='Text Box']")
    private WebElement textBoxPage;

    @FindBy(xpath = "//span[text()='Check Box']")
    private WebElement checkBoxPage;

    @FindBy(xpath = "//span[text()='Radio Button']")
    private WebElement radioButtonPage;

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTablesPage;

    @FindBy(xpath = "//span[text()='Buttons']")
    private WebElement buttonsPage;

    @FindBy(xpath = "//span[text()='Links']")
    private WebElement linksPage;

    @FindBy(xpath = "//span[text()='Broken Links - Images']")
    private WebElement brokenLinksImagesPage;

    @FindBy(xpath = "//span[text()='Upload and Download']")
    private WebElement uploadDownLoadPage;

    @FindBy(xpath = "//span[text()='Dynamic Properties']")
    private WebElement dynamicPropertiesPage;

    public Elements clickTextBoxPage(){
        elementActions.clickButton(textBoxPage);
        return this;
    }

    public Elements clickCheckBoxPage(){
        elementActions.clickButton(checkBoxPage);
        return this;
    }

    public Elements clickRadioButtonPage(){
        elementActions.clickButton(radioButtonPage);
        return this;
    }

    public Elements clickWebTablesPage(){
        elementActions.clickButton(webTablesPage);
        return this;
    }

    public Elements clickButtonsPage(){
        elementActions.clickButton(buttonsPage);
        return this;
    }

    public Elements clickLinksPage(){
        elementActions.clickButton(linksPage);
        return this;
    }

    public Elements clickBrokenLinksImagesPage(){
        elementActions.clickButton(brokenLinksImagesPage);
        return this;
    }

    public Elements clickUploadDownloadPage(){
        elementActions.clickButton(uploadDownLoadPage);
        return this;
    }

    public Elements clickDynamicPropertiesPage(){
        elementActions.clickButton(dynamicPropertiesPage);
        return this;
    }
}
