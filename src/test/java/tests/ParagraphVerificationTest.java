package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pages.BaseFunctions;
import pages.HomePage;
import pages.VacanciesPage;


public class ParagraphVerificationTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunctions baseFunctions;

    @Test
    public void skillsVerificationInParagraph() {
        LOGGER.info("Test verifies that items in a list under paragraph <Additional skills and qualification required for the higher position>: contains exactly 5 skills");

        baseFunctions = new BaseFunctions();
        baseFunctions.openPage("https://ctco.lv/en");

        HomePage homePage = new HomePage(baseFunctions);
        homePage.acceptCookies();
        homePage.mouseOverAndClick();

        VacanciesPage vacanciesPage = new VacanciesPage(baseFunctions);
        vacanciesPage.clickOnVacancy();

        vacanciesPage.getListsOfSkills();
    }

    @AfterEach
    public void CloseBrowser() {
        baseFunctions.closeBrowse();
    }
}

