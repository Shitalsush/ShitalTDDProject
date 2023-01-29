package TestNGDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@Test(dataProvider = "getExcelData")
	public void validateLogin(String uname,String pwd) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println(uname);
		System.out.println(pwd);
	
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="hr";
		data[1][1]="hr123";
		data[2][0]="user";
		data[2][1]="user123";
		
		return data;
		
	}
	
	@DataProvider
	public Object[][] getExcelData() throws IOException
	{
		ExcelReader reader = new ExcelReader();
		
		return reader.getData();
		
	}
}
