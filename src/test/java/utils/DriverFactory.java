package utils;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;
    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        if(driver == null) {
            initDriver();
        }
        return driver;
    }

    private static void initDriver() {
        if("Firefox".equalsIgnoreCase(System.getProperties().getProperty("desiredDriver"))) {
            driver = new FirefoxDriver();
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
    }

}
