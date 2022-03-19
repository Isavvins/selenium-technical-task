package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class VacanciesPage {
    private final By TEST_AUTOMATION_ENGINEER_SECTION = By.xpath(".//li[@id ='menu-item-4629']");
    private final By TEST_AUTOMATION_ENGINEER_TEXT_BLOCK = By.xpath(".//div[contains(@class, 'animated fadeIn active')]/div[@class = 'text-block']");

    private BaseFunctions baseFunctions;

    public VacanciesPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;

    }

    public void clickOnVacancy() {
        baseFunctions.click(TEST_AUTOMATION_ENGINEER_SECTION);
    }

    public List<WebElement> getListsOfSkills() {
        WebElement blockElement = baseFunctions.findElement(TEST_AUTOMATION_ENGINEER_TEXT_BLOCK);
        WebElement element = blockElement.findElements(By.tagName("ul")).get(1);
        return element.findElements(By.tagName("li"));

    }

}

