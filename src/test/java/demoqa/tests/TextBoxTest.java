package demoqa.tests;

import c.demoqa.models.UserTextBox;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import demoqa.BaseTest;

@Tag("UI")
public class TextBoxTest extends BaseTest {

    @Test
    void textBoxTest(){
        driver.get("https://demoqa.com/text-box");
        UserTextBox userTextBox = new UserTextBox("Meerzat","Umetaliva 217",
                "meerzat@gmail.com","Um 12");
        textBoxPage.fillUpTextBoxForm(userTextBox);
    }
}
