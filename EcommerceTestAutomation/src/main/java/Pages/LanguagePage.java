package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LanguagePage {
    private WebDriver driver;

    private By languageFlyout = By.id("icp-nav-flyout"); 
    private By languageDropdown = By.id("icp-dropdown");
    private By saveButton = By.id("icp-btn-save");

    public LanguagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLanguage(String language) throws InterruptedException {
        driver.findElement(By.id("icp-nav-flyout")).click();
        Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("icp-dropdown")));

        Select select = new Select(driver.findElement(By.id("icp-dropdown")));
        select.selectByVisibleText(language);

        driver.findElement(By.id("icp-btn-save")).click();
        Thread.sleep(4000);
    }
    String pageText = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
  //  Assert.assertTrue(pageText.contains("नमस्ते") || pageText.contains("Hello");
//
        //"Language did not switch correctly!";







    public String getPageTitle() {
        return driver.getTitle();
    }
}

	


