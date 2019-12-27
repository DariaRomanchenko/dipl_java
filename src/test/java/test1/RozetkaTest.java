package test1;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaTest {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
    }

    @Test
    public void graphicCardTest() {
        driver.get("https://rozetka.com.ua/");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']"))));
        driver.get("https://rozetka.com.ua/videocards/c80087/");
        WebElement desiredGood = driver.findElement(By.xpath("//span[text()=' Asus PCI-Ex GeForce GTX 1050 Ti Phoenix 4GB GDDR5 (128bit) (1290/7008) (DVI, HDMI, DisplayPort) (PH-GTX1050TI-4G) ']"));
        Assertions.assertThat(desiredGood.isDisplayed()).isTrue();
    }

    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }

}

