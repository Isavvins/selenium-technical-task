package tests;

import org.junit.jupiter.api.Test;
import pages.BaseFunctions;
import pages.HomePage;

public class ParagraphVerificationTest {
    private BaseFunctions baseFunctions;

    @Test
    public void skillsVerificationInParagraph() {
        baseFunctions = new BaseFunctions();
        baseFunctions.openPage("https://ctco.lv/en");

        HomePage homePage = new HomePage(baseFunctions);
        homePage.acceptCookies();
    }
}
