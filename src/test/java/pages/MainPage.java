package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

    public class MainPage extends AbstractPage {
            private static final String BASE_APP_URL = "https://rozetka.com.ua/";

            @FindBy(xpath = "(//a[@href='https://rozetka.com.ua/computers-notebooks/c80253/'])[2]")
            private WebElement laptopsAndComputersLink;

            public MainPage() {
                super();
                this.driver.get(BASE_APP_URL);
                defaultWait
                        .until(ExpectedConditions.elementToBeClickable(
                                By.xpath("//span[contains(text(), 'Каталог товаров')]")));
            }

            public LaptopsAndComputersPage goToLaptopsAndComputers() {
                this.laptopsAndComputersLink.click();
                return new LaptopsAndComputersPage();
            }

    }


