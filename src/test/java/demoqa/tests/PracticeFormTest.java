package demoqa.tests;

import c.demoqa.models.UserPracticeForm;
import c.demoqa.utils.RandomUtils;
import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UI")
public class PracticeFormTest extends BaseTest {

    @Test
    void practiceFormTest(){
        UserPracticeForm userPracticeForm = RandomUtils.generatePracticeFormUser();
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage.fillUpPracticeForm(userPracticeForm);
    }

    @Test
    void pageTest(){
        driver.get("https://demoqa.com/automation-practice-form");
        practiceFormPage.fillUserFirstName("Meerzat").fillUserLastName("Taalaibekova").fillUserEmail("qwerty@gmail.com")
                .choiceUserGender("female").fillUserMobileNumber("+7772323233")
                .fillDateOfBirth("19 July 2003").fillUserSubject("English").choiceHobbiesMusic()
                .uploadPicture("C:/first1/Apple/src/test/resources/cat.png").fillUserCurrentAddress("Umetalieva 217");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
