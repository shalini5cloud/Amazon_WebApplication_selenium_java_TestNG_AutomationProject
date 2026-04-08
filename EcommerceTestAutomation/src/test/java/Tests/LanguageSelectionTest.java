package Tests;


	import BaseTest.BaseTest;
	import Pages.SearchPage;
	import Pages.ProductPage;
import Pages.CartOperation;
import Pages.LanguagePage;

import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	
public class LanguageSelectionTest extends BaseTest {

    @Test
    public void switchToHindiTest() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        LanguagePage langPage = new LanguagePage(driver);

        langPage.selectLanguage("हिन्दी - HI");
        Thread.sleep(4000);
        Assert.assertTrue(langPage.getPageTitle().contains("Amazon"), "Page did not reload correctly in Hindi!");
    }

    @Test
    public void switchToTamilTest() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        LanguagePage langPage = new LanguagePage(driver);

        langPage.selectLanguage("தமிழ் - TA");
        Thread.sleep(4000);
        Assert.assertTrue(langPage.getPageTitle().contains("Amazon"), "Page did not reload correctly in Tamil!");
    }

    @Test
    public void switchToEnglishTest() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        LanguagePage langPage = new LanguagePage(driver);

        langPage.selectLanguage("English - EN");
        Thread.sleep(4000);
        Assert.assertTrue(langPage.getPageTitle().contains("Amazon"), "Page did not reload correctly in English!");
    }
    
  



}

		

	
	