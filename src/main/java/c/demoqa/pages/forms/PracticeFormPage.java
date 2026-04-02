package c.demoqa.pages.forms;
import c.demoqa.drivers.DriverManager;
import c.demoqa.models.UserPracticeForm;
import c.demoqa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeFormPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement userFirstName;

    @FindBy(id = "lastName")
    private WebElement userLastName;

    @FindBy(id = "userEmail")
    private WebElement userEmail;

    @FindBy(css = "input[value = 'Male'] + label")
    private WebElement maleButton;

    @FindBy(css = "input[value = 'Female'] + label")
    private WebElement femaleButton;

    @FindBy(css = "input[value = 'Other'] + label")
    private WebElement otherButton;

    @FindBy(id = "userNumber")
    private WebElement userNumber;

    @FindBy(css = ".react-datepicker-wrapper")
    private WebElement datePicker;

    @FindBy(id = "subjectsInput")
    private WebElement userSubjects;

    @FindBy(xpath = "//label[text()='Sports']")
    private WebElement hobbiesSports;

    @FindBy(xpath = "//label[text()='Reading']")
    private WebElement hobbiesReading;

    @FindBy(xpath = "//label[text()='Music']")
    private WebElement hobbiesMusic;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    private WebElement userCurrentAddress;

    @FindBy(id = "submit")
    private WebElement submit;

    public PracticeFormPage fillUserFirstName(String firstName){
        elementActions.inputText(userFirstName,firstName);
        return this;
    }

    public PracticeFormPage fillUserLastName(String lastName){
        elementActions.inputText(userLastName,lastName);
        return this;
    }

    public PracticeFormPage fillUserEmail(String email){
        elementActions.inputText(userEmail,email);
        return this;
    }

    public PracticeFormPage choiceUserGender(String gender){
        switch (gender.toLowerCase().trim()){
            case "male":
                elementActions.clickButton(maleButton);
                break;
            case "female":
                elementActions.clickButton(femaleButton);
                break;
            case "other":
                elementActions.clickButton(otherButton);
                break;
            default:
                throw new IllegalArgumentException("Неверный пол " + gender);
        }
        return this;
    }

    public PracticeFormPage fillUserMobileNumber(String mobilNumber){
        elementActions.inputText(userNumber,mobilNumber);
        return this;
    }

    public PracticeFormPage uploadPicture(String pictureLink){
        elementActions.inputText(uploadPicture,pictureLink);
        return this;
    }

    //                                               05 Feb 2026
    public PracticeFormPage fillDateOfBirth(String dateMonthYear){
       String [] dateMonthYearParts = dateMonthYear.split(" ");
       String day = dateMonthYearParts[0];
       String month = dateMonthYearParts[1];
       String year = dateMonthYearParts[2];
       elementActions.clickButton(datePicker);
       WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
       WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By
               .className("react-datepicker__month-select")));
       WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By
               .className("react-datepicker__year-select")));
       elementActions.selectByVisibleText(monthDropDown,month);
       elementActions.selectByVisibleText(yearDropDown,year);
       WebElement dayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div" +
               "[contains(@class,'react-datepicker__day') and not(contains(@class,'react-datepicker__day--outside-month')) " +
               "and text()=" + day + "]")));
       elementActions.clickButton(dayElement);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public PracticeFormPage fillUserSubject(String subject){
        elementActions.inputText(userSubjects,subject);
        userSubjects.sendKeys(Keys.RETURN);
        return this;
    }

    public PracticeFormPage choiceHobbiesSports(){
        elementActions.clickButton(hobbiesSports);
        return this;
    }

    public PracticeFormPage choiceHobbiesReading(){
        elementActions.clickButton(hobbiesReading);
        return this;
    }

    public PracticeFormPage choiceHobbiesMusic(){
        elementActions.clickButton(hobbiesMusic);
        return this;
    }

    public PracticeFormPage fillUserCurrentAddress(String currentAddress){
        elementActions.inputText(userCurrentAddress,currentAddress);
        return this;
    }

    public PracticeFormPage fillUpPracticeForm(UserPracticeForm userPracticeForm){
        fillUserFirstName(userPracticeForm.getFirsName()).fillUserLastName(userPracticeForm.getLastName())
                .fillUserEmail(userPracticeForm.getUserEmail()).choiceUserGender(userPracticeForm.getGender())
                .fillUserSubject(userPracticeForm.getSubject())
                .choiceHobbiesSports().choiceHobbiesReading()
                .choiceHobbiesMusic().fillUserCurrentAddress(userPracticeForm.getUserCurrentAddress());
        return this;
    }
}
