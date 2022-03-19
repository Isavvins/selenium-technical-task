package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.BaseFunctions;
import pages.HomePage;
import pages.VacanciesPage;

import java.util.List;

public class ParagraphVerificationTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunctions baseFunctions;

    @Test
    public void skillsVerificationInParagraph() {
        LOGGER.info("Test verifies that paragraph under <Additional skills and qualification> : contains exactly 5 skills");

        baseFunctions = new BaseFunctions();
        baseFunctions.openPage("https://ctco.lv/en");

        HomePage homePage = new HomePage(baseFunctions);
        homePage.acceptCookies();

        homePage.mouseOverAndClick();

        VacanciesPage vacanciesPage = new VacanciesPage(baseFunctions);
        vacanciesPage.clickOnVacancy();

        List<WebElement> skills = vacanciesPage.getListsOfSkills();
        Assertions.assertEquals(5, skills.size(), "Paragraph contains incorrect skills count");
    }

    @AfterEach
    public void CloseBrowser() {
        baseFunctions.closeBrowse();
    }
}
