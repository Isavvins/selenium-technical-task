package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunctions {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    WebDriver driver;
    WebDriverWait wait;
    Actions builder;

    public BaseFunctions() {
        LOGGER.info("Starting Web browser");
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        builder = new Actions(driver);
    }

    public void openPage(String url) {
        LOGGER.info("Opening page by URL: " + url);
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void click(By locator) {
        LOGGER.info("Clicking on element: " + locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void mouseOverEvent(WebElement element) {
        LOGGER.info("Mouseover to the element ");
        builder.moveToElement(element).build().perform();
    }

    public WebElement findElement(By locator) {
        LOGGER.info("Finding element by locator: " + locator);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void closeBrowse() {
        LOGGER.info("Closing browser window");
        if (driver != null) {
            driver.close();
        }
    }
}

