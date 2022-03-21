package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final By ACCEPT_COOKIE_BTN = By.className("ok");
    private final By CAREERS_NAVBAR_SECTION = By.xpath(".//li[@id = 'menu-item-127']");
    private final By VACANCIES_MENU_ITEM = By.xpath(".//li[@id ='menu-item-131']");

    private BaseFunctions baseFunctions;

    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void acceptCookies() {
        baseFunctions.click(ACCEPT_COOKIE_BTN);
    }

    public void mouseOverAndClick() {
        WebElement element = baseFunctions.findElement(CAREERS_NAVBAR_SECTION);
        baseFunctions.mouseOverEvent(element);
        baseFunctions.click(VACANCIES_MENU_ITEM);
    }
}

