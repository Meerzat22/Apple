package c.demoqa.pages.elements;
import c.demoqa.models.UserTextBox;
import c.demoqa.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    private WebElement userName;

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id = "submit")
    private WebElement submit;

    //если чейнить возвращаем сам класс
    public TextBoxPage fillUserName(String userN){
        elementActions.inputText(userName,userN);
        return this;
    }

    public TextBoxPage fillUserEmail(String userE){
        elementActions.inputText(userEmail,userE);
        return this;
    }

    public TextBoxPage fillUserCurrentAddress(String currentAdd){
        elementActions.inputText(currentAddress,currentAdd);
        return this;
    }

    public TextBoxPage fillUserPermanentAddress(String permanentAdd){
        elementActions.inputText(permanentAddress,permanentAdd);
        return this;
    }

    public TextBoxPage submitBtn(){
        elementActions.clickButton(submit);
        return this;
    }

    public TextBoxPage fillUpTextBoxForm(UserTextBox user){
        fillUserName(user.getName()).fillUserEmail(user.getEmail()).fillUserCurrentAddress(user.getCurrentAddress())
                .fillUserPermanentAddress(user.getPermanentAddress());
        return this;
    }
}
