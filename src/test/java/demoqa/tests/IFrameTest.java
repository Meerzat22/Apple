package demoqa.tests;

import demoqa.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("UI")
public class IFrameTest extends BaseTest {

    @Test
    void iframeTest(){
        driver.get("https://demoqa.com/frames");
        iFrameHelper.switchToFrame("frame1");
        String txt = iFramePage.getSampleHeadingText();
        System.out.println(txt);

        iFrameHelper.switchToParentFrame();

        iFrameHelper.switchToFrame("frame2");
        String txt2 = iFramePage.getSampleHeadingText();
        System.out.println(txt2);
    }
}
