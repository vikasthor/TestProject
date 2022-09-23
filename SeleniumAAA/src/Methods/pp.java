package Methods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pp {

	
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("Before Class");
	 }
	 
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("Before method");
	 }
	 
	 @Test
	 public void test123()
	 {
		 System.out.println("Test");
	 }
	 

	}



	