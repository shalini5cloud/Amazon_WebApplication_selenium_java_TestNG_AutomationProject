package Tests;


	import BaseTest.BaseTest;
	import Pages.SearchPage;
	import Pages.ProductPage;
import Pages.CartOperation;
import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;

	public class CartOperationTest extends BaseTest {

	    @Test(priority=0)
	    public void addAndRemoveProductTest() throws InterruptedException {
	        SearchPage searchPage = new SearchPage(driver);
	        searchPage.searchProduct("Smartwatch");

	        // Click first product
	        driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"))
	              .get(0).click();

	        ProductPage productPage = new ProductPage(driver);
	        productPage.addToCart();

	        CartOperation CartOperation = new CartOperation(driver);
	        CartOperation.openCart();

	        // Verify product added
	        Assert.assertTrue(CartOperation.getCartItemCount() > 0, "Cart is empty after adding product!");

	        // Remove product
	        CartOperation.removeItem();

	        // Verify cart empty
	        Assert.assertEquals(CartOperation.getCartItemCount(), 0, "Cart is not empty after removing product!");
	    }

	   @Test(priority=1)
	    public void updateQuantityTest() throws InterruptedException {
	        SearchPage searchPage = new SearchPage(driver);
	        searchPage.searchProduct("iphonw 17 Air  ");

	        driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"))
	              .get(0).click();

	        ProductPage productPage = new ProductPage(driver);
	        productPage.addToCart();

	        CartOperation cartPage =  new CartOperation(driver);
	        cartPage.openCart();
	        Thread.sleep(4000);
	    }
	  @Test(priority=2)
	    public void verifySubtotalUpdatesTest() throws InterruptedException {
	        SearchPage searchPage = new SearchPage(driver);
	        searchPage.searchProduct("iphone 14 pro");

	        // Click first product
	        driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"))
	              .get(0).click();

	        ProductPage productPage = new ProductPage(driver);
	        productPage.addToCart();

	        CartOperation CartOperation = new CartOperation(driver);
	        CartOperation.openCart();

	        // Capture subtotal before quantity change
	        String subtotalBefore =CartOperation.getSubtotal();
	        System.out.println("Subtotal before: " + subtotalBefore);
	        Thread.sleep(5000);
	        

	        // Change quantity to 2
	      //  CartOperation.changeQuantity("2");

	        // Capture subtotal after quantity change
	        String subtotalAfter = CartOperation.getSubtotal();
	        System.out.println("Subtotal after: " + subtotalAfter);
	       // Thread.sleep(5000);

	        // Verify subtotal updated
	        Assert.assertNotEquals(subtotalBefore, subtotalAfter, "Subtotal did not update after changing quantity!");
	    }
	    @Test(priority=3)
	    public void removeFromEmptyCartTest() {
	    	 CartOperation  CartOperation= new CartOperation(driver);
	    	 CartOperation.openCart();

	        // Verify cart is empty
	        Assert.assertEquals( CartOperation.getCartItemCount(), 0, "Cart should be empty initially!");

	        // Try to find delete button
	        boolean deleteButtonExists = driver.findElements(By.cssSelector("input[value='Delete']")).size() > 0;
	        Assert.assertFalse(deleteButtonExists, "Delete button should not be present in empty cart!");
	    }
	    
	  @Test(priority=4)
	    public void subtotalEmptyCartTest() {
	    	 CartOperation cartoperation= new CartOperation(driver);
	    	  cartoperation.openCart();

	        String subtotal = cartoperation.getSubtotal();
	        Assert.assertTrue(subtotal.contains("0") || subtotal.equals("₹0.00"), "Subtotal should be zero for empty cart!");
	    }
	    
	    @Test(priority=5)
	    public void quantityDropdownEmptyCartTest() {
	        CartOperation cartoperation = new CartOperation(driver);
	        
	        cartoperation.openCart();

	        boolean dropdownExists = driver.findElements(By.name("quantity")).size() > 0;
	        Assert.assertFalse(dropdownExists, "Quantity dropdown should not be present in empty cart!");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	

	        // Change quantity to 2
	    //    cartPage.changeQuantity("2");

	        // Verify subtotal updated
	       // String subtotal = cartPage.getSubtotal();
	       // Assert.assertTrue(subtotal.contains("2"), "Subtotal did not update for quantity change!");
	    }
	


