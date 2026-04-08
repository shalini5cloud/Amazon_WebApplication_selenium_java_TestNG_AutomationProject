package Pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

	public class CartOperation {
	    private WebDriver driver;

	    private By cartIcon = By.id("nav-cart");
	    private By cartItems = By.cssSelector("div.sc-list-item");
	    private By deleteButton = By.cssSelector("input[value='Delete']");
	    private By quantityDropdown = By.name("quantity");
	    private By subtotal = By.id("sc-subtotal-amount-buybox");

	    public CartOperation(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openCart() {
	        driver.findElement(cartIcon).click();
	    }

	    public int getCartItemCount() {
	        return driver.findElements(cartItems).size();
	    }

	    public void removeItem() {
	        driver.findElement(deleteButton).click();
	    }
	        public void changeQuantity(String qty) {
	            Select select = new Select(driver.findElement(quantityDropdown));
	            select.selectByVisibleText(qty);
	        }

	        public String getSubtotal() {
	        	 return driver.findElement(subtotal).getText();
	        }

			public void payorder() {
				// TODO Auto-generated method stub
				
			}
	    }


