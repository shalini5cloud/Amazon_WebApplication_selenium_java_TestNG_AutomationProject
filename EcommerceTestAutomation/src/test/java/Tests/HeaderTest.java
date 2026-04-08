package Tests;


	import BaseTest.BaseTest;
	import Pages.HeaderPage;
	import org.testng.annotations.Test;

	public class HeaderTest extends BaseTest {

	    @Test(priority=0)
	    public void clickHeaderOptionsTest() throws InterruptedException {
	        HeaderPage headerPage = new HeaderPage(driver);
	        

	        headerPage.clickSell();
	        Thread.sleep(2000);
	        driver.navigate().back();
	    }
	       
	        @Test(priority=1)
		    public void clickHeaderOptionsTest1() throws InterruptedException {
		        HeaderPage headerPage = new HeaderPage(driver);

	        

	        headerPage.clickBestSellers();
	        Thread.sleep(2000);
	        driver.navigate().back();
	        }
	        @Test(priority=2)
	        public void clickHeaderOptionsTest2() throws InterruptedException {
		        HeaderPage headerPage = new HeaderPage(driver);

	        headerPage.clickMXPlayer();
	        Thread.sleep(2000);
	        System.out.println("print yes if clicked ");
	        driver.navigate().back();
	        }
	        @Test(priority=3)
	        public void clickHeaderOptionsTest3() throws InterruptedException {
		        HeaderPage headerPage = new HeaderPage(driver);

	        headerPage.clickTodaysDeals();
	        Thread.sleep(2000);
	        System.out.println("print yes if clicked ");
	        driver.navigate().back();
	        }
	        @Test(priority=4)
	        public void clickHeaderOptionsTest4() throws InterruptedException {
		        HeaderPage headerPage = new HeaderPage(driver);

	        headerPage.clickMobiles();
	        Thread.sleep(2000);
	        System.out.println("print yes if clicked ");
	        driver.navigate().back();
	        }
	        @Test(priority=5)
	        public void clickHeaderOptionsTest5() throws InterruptedException {
		        HeaderPage headerPage = new HeaderPage(driver);

	        headerPage.clickCustomerService();
	        Thread.sleep(2000);
	        System.out.println("print yes if clicked ");
	        driver.navigate().back();
	        }
	        @Test(priority=6)
	        public void clickHeaderOptionsTest6() throws InterruptedException {
		        HeaderPage headerPage = new HeaderPage(driver);

	        headerPage.clickPrime();
	        Thread.sleep(2000);
	        System.out.println("print yes if clicked ");
	        driver.navigate().back();
	    }
	}


