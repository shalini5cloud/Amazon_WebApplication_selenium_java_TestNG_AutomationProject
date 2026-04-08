package utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {


    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Set path to your ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\pointers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void setDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }

    // Utility method to scroll to an element
    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


