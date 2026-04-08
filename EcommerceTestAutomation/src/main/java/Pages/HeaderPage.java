package Pages;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class HeaderPage {
	    private WebDriver driver;

	    // Locators for header options
	    private By sellLink = By.linkText("Sell");
	    private By bestSellersLink = By.linkText("Best Sellers");
	    private By mxPlayerLink = By.linkText("MX Player");
	    private By todaysDealsLink = By.linkText("Today's Deals");
	    private By mobilesLink = By.linkText("Mobiles");
	    private By customerServiceLink = By.linkText("Customer Service");
	    private By primeLink = By.linkText("Prime");

	    public HeaderPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickSell() throws InterruptedException {
	        driver.findElement(sellLink).click();
	        Thread.sleep(4000);
	    }

	    public void clickBestSellers() throws InterruptedException {
	        driver.findElement(bestSellersLink).click();
	        Thread.sleep(4000);
	    }

	    public void clickMXPlayer() throws InterruptedException {
	        driver.findElement(mxPlayerLink).click();
	        Thread.sleep(4000);
	    }

	    public void clickTodaysDeals() throws InterruptedException {
	        driver.findElement(todaysDealsLink).click();
	        Thread.sleep(4000);
	    }

	    public void clickMobiles() throws InterruptedException {
	        driver.findElement(mobilesLink).click();
	        Thread.sleep(4000);
	    }

	    public void clickCustomerService() throws InterruptedException {
	        driver.findElement(customerServiceLink).click();
	        Thread.sleep(4000);
	    }

	    public void clickPrime() throws InterruptedException {
	        driver.findElement(primeLink).click();
	        Thread.sleep(4000);
	    }
	}


