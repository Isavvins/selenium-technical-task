package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class VacanciesPage {
    private final By TEST_AUTOMATION_ENGINEER_SECTION = By.xpath(".//li[@id ='menu-item-4629']");
    private final By TEST_AUTOMATION_ENGINEER_BLOCK = By.xpath(".//div[contains(@class, 'animated fadeIn active')]/div[@class = 'text-block']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunctions baseFunctions;

    public VacanciesPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void clickOnVacancy() {
        baseFunctions.click(TEST_AUTOMATION_ENGINEER_SECTION);
    }

    public void getListsOfSkills() {
        LOGGER.info("Getting all skills: ");
        WebElement blockElement = baseFunctions.findElement(TEST_AUTOMATION_ENGINEER_BLOCK);
        WebElement ulElement = blockElement.findElements(By.tagName("ul")).get(1);
        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

        for (int i = 0; i < liElements.size(); i++) {
            System.out.println(i + ": " + liElements.get(i).getText());
        }
        Assertions.assertEquals(5, liElements.size(), "Paragraph contains incorrect skills count");
    }

}






