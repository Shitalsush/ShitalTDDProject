package TestNGDemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {

	@BeforeSuite
	public void ConnectingDB()
	{
		System.out.println("Before Suite-Connecting DB");
	}
	
	@BeforeTest
	public void configuringTest() {
		System.out.println("Before Test - Cofiguring Test");
	}
	
	@BeforeClass
	public void cofiguringBrowser() {
		System.out.println("Before Class- Cofiguring Browser");
	}
	
	@BeforeMethod
	public void launchingBrowserAndApplication() {
		System.out.println("Before Method - Launching browser and application");
		
	}
	
	@Test
	public void validateLogin()
	{
		System.out.println("Validating login");
	}
	
	@AfterSuite
	public void closingDB() {
		System.out.println("After suite - closing DB");
		
	}
	
	@AfterTest
	public void testClosure() {
		System.out.println("After test - test closure");
	}
	
	@AfterClass
	public void cacheCancle() {
		System.out.println("After class - clear cache");
	}
	
	@AfterMethod
	public void closingBrowserAndApplication() {
		System.out.println("After Method - Closing browser and application");
	}
	
	@Test
	public void validateTitle() {
		System.out.println("Validate title");
	}
	
}
