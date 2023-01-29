package Seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssignment1 {

	WebDriver driver;
	
	@BeforeTest
	public void initializeDrivers()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
	}
	
	@Test
	public void validateLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("shital@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}
}
