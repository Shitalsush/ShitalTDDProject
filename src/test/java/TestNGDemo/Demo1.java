package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	public static WebDriver driver;
	
	@BeforeTest
	public static void initializeDriver() {
		  driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
	}
	
	@Test
	public static void enterUserNameAndPassword() {
		driver.findElement(By.id("email")).sendKeys("shital@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("1234");
	}
	
	@AfterMethod
	public static void closeApplication() {
		driver.close();
	}
//	
//	public static void main(String[] args) {
//		
//	
////		
////		initializeDriver();
////		enterUserNameAndPassword();
////		closeApplication();
//	}
}
