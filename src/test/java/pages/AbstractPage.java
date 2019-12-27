package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class AbstractPage {
        WebDriver driver;
        WebDriverWait defaultWait;
        AbstractPage() {
            this.driver = DriverFactory.getDriver();
            this.defaultWait = new WebDriverWait(driver, 5);
            PageFactory.initElements(driver, this);
        }
    }
