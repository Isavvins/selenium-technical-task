package pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    public void getListsOfSkills() {
        WebElement blockElement = baseFunctions.findElement(TEST_AUTOMATION_ENGINEER_TEXT_BLOCK);
        WebElement element = blockElement.findElements(By.tagName("ul")).get(2);
        List<WebElement> listsOfSkills = element.findElements(By.tagName("li"));
        System.out.println(listsOfSkills.size());




    }

}

