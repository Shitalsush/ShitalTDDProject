package Seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenAssignment {
	
	WebDriver driver;
	
	@BeforeTest
	public void initializeDriver()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
	}
	
	@Test(dataProvider = "getData")
	public void validateLogin(String uname, String pwd) throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("passwd")).sendKeys(pwd);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		data[0][0]="shital@gmail.com";
		data[0][1]="abc123";
	
		return data;
	}
	
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
