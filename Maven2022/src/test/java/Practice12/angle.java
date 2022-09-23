package Practice12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Practice.AngelOneLogin;
import Practice.AngleMarket;
import Practice.AngleOrders;

public class angle 
{

	
		private WebDriver driver;
		private AngelOneLogin userId, pswd, signIn,popop;
		private  AngleMarket market, searchBox, buy, cNf,submit1,share;
		private AngleOrders order, check, modify, submit, confm, cancel,ok1,ok2;
	
				@BeforeClass
				public void launchBrowser()
				{
					System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
					  driver= new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);}
		@BeforeMethod
		public void openLoginPage() {
			  driver.get("https://trade.angelbroking.com/Login");
			  userId= new AngelOneLogin (driver);
			  userId.sendusername(); 
			  pswd= new AngelOneLogin (driver);
			 pswd.sendPwd();
			 signIn= new AngelOneLogin (driver);
			 signIn.clickSignIn();
			 popop= new AngelOneLogin (driver);
			 popop.popup();
		}
				
				  
		/*// String Url3 = driver.getCurrentUrl();
			 String title = driver.getTitle();
			//if(Url3.equals(" https://trade.angelbroking.com/portfolio/equity/index_v1"))
		if (title.equals("Portfolio | Equity_New")) 
			     {
			popop= new AngelOneLogin (driver);
			 popop.popup();
		}
			else
			{
				System.out.println("ok");
			}	
		
		}
		
		
		/*@Test
				public void a_verifyingMarketOrder() {
				    market = new AngleMarket (driver);
					market.clickOnMarket();
		             searchBox = new AngleMarket (driver);
		             searchBox.clickOnsearchBox();
		            share = new AngleMarket (driver);
		            share.clickOnshare();
		             buy = new AngleMarket (driver);
		             buy.clickOnbuy();  
		             submit1 = new AngleMarket (driver);
		             submit1.submt();  
		            cNf = new AngleMarket (driver);
		             cNf.cnf();
		       
		           String Url2 = driver.getCurrentUrl();
		           
		           if ( Url2.equals( "https://trade.angelbroking.com/trade/trading/watchlist?bsflag=buy"))
					 {
						 System.out.println("Test1- PASS");
					 }
					 else
					 {
						 System.out.println("Test1- FAIL");
					 }
		           
		           Assert.assertEquals(Url2,"https://trade.angelbroking.com/trade/trading/watchlist?bsflag=buy");
		           
		    	 }
	 @Test
			public void b_verfyingOredrpage() {
		order = new AngleOrders (driver);
		  order.clickOnOrder();
		           check = new AngleOrders (driver);
		          check.checkbox12();	
				  modify = new AngleOrders (driver);
				  modify.clickOnModify();
				 submit = new AngleOrders (driver);
				 submit.submt();	
				confm = new AngleOrders (driver);
				confm.cnf2();	  
			 String Url = driver.getCurrentUrl(); 
			 
			 if ( Url.equals( "https://trade.angelbroking.com/trade/trading/orderbook?bsflag=buy"))
			 {
				 System.out.println("Test2- PASS");
			 }
			 else
			 {
				 System.out.println("Test2- FAIL");
			 }
	 }
			 
			// Assert.assertEquals(Url, "https://trade.angelbroking.com/trade/trading/orderbook?bsflag=buy");}
		
	 /*@Test
		public void c_verfyingOrderCancelButton() {
		 order = new AngleOrders (driver);
		  order.clickOnOrder();
		  check = new AngleOrders (driver);
		  check.checkbox12();	
		cancel = new AngleOrders (driver);
		  cancel.clickOnCancel();
		 ok1 = new AngleOrders (driver);
		 ok1.ok11();	
		ok2 = new AngleOrders (driver);
		ok2.ok22();
		 String Url5 = driver.getCurrentUrl(); 
		 
		 if ( Url5.equals( "https://trade.angelbroking.com/trade/trading/orderbook"))
		 {
			 System.out.println("Test3- PASS");
		 }
		 else
		 {
			 System.out.println("Test3- FAIL");
		 }
		 
		 //Assert.assertEquals(Url5,"https://trade.angelbroking.com/trade/trading/orderbook");
	 }*/

		@AfterMethod
		
		public void logoutFromApp()
	
		{System.out.println("After method");}
		@AfterClass
		public void closedBrowser()
		{System.out.println("After class");
			//driver.close();
		}
}

		
			
		   


