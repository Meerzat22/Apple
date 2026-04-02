package c.demoqa.pages.elements;

import c.demoqa.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@Getter
public class LinksPage extends BasePage {

    @FindBy(id = "simpleLink")
    private WebElement homeBtn;

    @FindBy(id = "dynamicLink")
    private WebElement homeNTadoBtn;

    @FindBy(id = "created")
    private WebElement createdBtn;

    @FindBy(id = "no-content")
    private WebElement noContentBtn;

    @FindBy(id = "moved")
    private WebElement movedBtn;

    @FindBy(id = "bad-request")
    private WebElement badRequestBtn;

    @FindBy(id = "unauthorized")
    private WebElement unauthorizedBtn;

    @FindBy(id = "forbidden")
    private WebElement forbiddenBtn;

    @FindBy(id = "invalid-url")
    private WebElement invalidUrlBtn;

    List<WebElement> allButtons = List.of(homeBtn,homeNTadoBtn,createdBtn,noContentBtn,movedBtn,badRequestBtn,
            unauthorizedBtn,forbiddenBtn,invalidUrlBtn);


}







