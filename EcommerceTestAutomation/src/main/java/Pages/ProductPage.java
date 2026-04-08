package Pages;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ProductPage {
	    private WebDriver driver;

	    private By addToCartButton = By.id("a-autoid-5-announce");
	    private By cartCount = By.id("nav-cart-count");
	    private By altAddToCartButton = By.id("submit.add-to-cart");

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void addToCart() throws InterruptedException {
	        driver.findElement(addToCartButton).click();
	        Thread.sleep(3000);	    }

	    public String getCartCount() {
	        return driver.findElement(cartCount).getText();
	        
	    }
	    public void addToCartdress() throws InterruptedException {
	        driver.findElement(addToCartButton).click();
	        Thread.sleep(3000);	    }

	    public String getCartCount1() {
	        return driver.findElement(cartCount).getText();
	        
	    }
	    
	    public void addToCartTV() throws InterruptedException {
	        driver.findElement(addToCartButton).click();
	        Thread.sleep(3000);	    }

	    public String getCartCount2() {
	        return driver.findElement(cartCount).getText();
	        
	    }
	    
	    public void GetaddToCart() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        if (driver.findElements(addToCartButton).size() > 0) {
	            wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
	            driver.findElement(addToCartButton).click();
	        } else if (driver.findElements(altAddToCartButton).size() > 0) {
	            wait.until(ExpectedConditions.elementToBeClickable(altAddToCartButton));
	            driver.findElement(altAddToCartButton).click();
	        } else {
	            throw new RuntimeException("Add to Cart button not found!");
	        }
	    }

	    public String getCartCountforitems() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(cartCount));
	        return driver.findElement(cartCount).getText();
	    }
	    public void GetaddToCartmoderndress() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        if (driver.findElements(addToCartButton).size() > 0) {
	            wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
	            driver.findElement(addToCartButton).click();
	        } else if (driver.findElements(altAddToCartButton).size() > 0) {
	            wait.until(ExpectedConditions.elementToBeClickable(altAddToCartButton));
	            driver.findElement(altAddToCartButton).click();
	        } else {
	            throw new RuntimeException("Add to Cart button not found!");
	        }
	    }

	    public String getCartCountforitems1() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(cartCount));
	        return driver.findElement(cartCount).getText();
	    }
	    public void GetaddToCartfacewash() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        if (driver.findElements(addToCartButton).size() > 0) {
	            wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
	            driver.findElement(addToCartButton).click();
	        } else if (driver.findElements(altAddToCartButton).size() > 0) {
	            wait.until(ExpectedConditions.elementToBeClickable(altAddToCartButton));
	            driver.findElement(altAddToCartButton).click();
	        } else {
	            throw new RuntimeException("Add to Cart button not found!");
	        }
	    }

	    public String getCartCountforitems2() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(cartCount));
	        return driver.findElement(cartCount).getText();
	    }
	}
	    
	


