package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LaptopsAndComputersPage extends AbstractPage {
    private static final By VIDEOADAPTERS_LOCATOR = By.xpath("//a[contains(text(), 'Видеокарты')]");

    public VideoAdaptersPage goToVideoAdapters() {
        defaultWait.until(ExpectedConditions.visibilityOf(driver.findElement(VIDEOADAPTERS_LOCATOR))).click();
        return new VideoAdaptersPage();
    }
}

