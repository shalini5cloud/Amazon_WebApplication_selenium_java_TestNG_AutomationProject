package Tests;



import BaseTest.BaseTest;
import Pages.SearchPage;
import Pages.ProductPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test(priority=0)
    public void addProductToCartTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("Smartwatch");

        // Click first product
        driver.findElements(searchPage.searchResults).get(0).click();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        Thread.sleep(5000);
        System.out.println("print yes if tv added to cart ");// wait for cart update

        Assert.assertEquals(productPage.getCartCount(), "1", "Cart count did not update!");
    }
   
   @Test(priority=1)
    public void addProductToCartTestwomensdress() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("jeans for womens");

        // Click first product
        driver.findElements(searchPage.searchResults).get(0).click();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        Thread.sleep(5000); 
        System.out.println("print yes if tv added to cart ");
        Thread.sleep(3000);
    

        Assert.assertEquals(productPage.getCartCount(), "1", "Cart count did not update!");
    }
    @Test(priority=2)
    
    public void addProductToCartTesttelevison() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("tv");

        // Click first product
        driver.findElements(searchPage.searchResults).get(0).click();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        Thread.sleep(5000);
        System.out.println("print yes if tv added to cart ");// wait for cart update

        Assert.assertEquals(productPage.getCartCount(), "1", "Cart count did not update!");
    }
    @Test(priority=3)
    public void addProductToCartTestshop() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("Smartwatch");

        // Click first product
        driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"))
              .get(0).click();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        // Navigate to cart page to confirm
        driver.findElement(By.id("nav-cart")).click();

        Assert.assertTrue(driver.getPageSource().contains("Smartwatch"), "Product not found in cart!");
    }
    @Test(priority=4)
    public void addProductToCartTestshopdress() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("short tops for womens");

        // Click first product
        driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"))
              .get(0).click();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        // Navigate to cart page to confirm
        driver.findElement(By.id("nav-cart")).click();

        Assert.assertTrue(driver.getPageSource().contains("Smartwatch"), "Product not found in cart!");
    }
    @Test(priority=5)
    public void addProductToCartTestoilyskin() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("ponds cream for womens");

        // Click first product
        driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"))
              .get(0).click();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

        // Navigate to cart page to confirm
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(3000);

        Assert.assertTrue(driver.getPageSource().contains("Smartwatch"), "Product not found in cart!");
    }
    @Test(priority=6)
    public void searchAndTakeScreenshotTest() throws IOException, InterruptedException {
        // Step 1: Search for Smartwatch
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("Smartwatch");

        // Step 2: Take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(4000);

        // Step 3: Save screenshot to local folder
        File destination = new File("C:\\ScreenshotPage/amazon_search.png");
        FileUtils.copyFile(screenshot, destination);

        System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
    }
}



