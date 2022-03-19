package pages;

import org.openqa.selenium.By;

public class HomePage {
    private final By ACCEPT_COOKIE_BTN = By.className("ok");

    private BaseFunctions baseFunctions;

    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;

    }

    public void acceptCookies() {
        baseFunctions.click(ACCEPT_COOKIE_BTN);

    }
}

