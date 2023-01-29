package Seleniumassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupAssignment {

	WebDriver driver;
	
	@BeforeMethod
	public void initializeDrivers() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/forms");
	}
	
	@Test(groups = "smoke")
	public void clickOnForms() throws InterruptedException
	{
	 
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.id("item-0"));
		ele1.click();
	}
	
	@Test(groups = "smoke")
	public void practiseForm() {
		
	}
	
	
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
	
}
