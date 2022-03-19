package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final By ACCEPT_COOKIE_BTN = By.className("ok");
    private final By CAREERS_NAVBAR_SECTION = By.xpath(".//li[@id = 'menu-item-127']");
    private final By VACANCIES_MENU_ITEM = By.xpath(".//li[@id ='menu-item-131']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunctions baseFunctions;

    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void acceptCookies() {
        LOGGER.info("Accepting cookies");
        baseFunctions.click(ACCEPT_COOKIE_BTN);
    }

    public void mouseOverAndClick() {
        LOGGER.info("Mouseover event ---> Pointing mouse on particular element and clicking on it");
        WebElement element = baseFunctions.findElement(CAREERS_NAVBAR_SECTION);
        baseFunctions.mouseOverEvent(element);
        baseFunctions.click(VACANCIES_MENU_ITEM);
    }
}

