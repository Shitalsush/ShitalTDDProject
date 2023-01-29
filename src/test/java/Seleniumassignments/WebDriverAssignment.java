package Seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Amazon Test 
		String expectedAmazonTitle="Amazon.com. Spend less. Smile more.";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String actualAmazontitle=driver.getTitle();
		System.out.println(actualAmazontitle);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		if(actualAmazontitle==expectedAmazonTitle)
			
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		
		//FaceBook test
		
		String expectedFaceBookTitle="Facebook – log in or sign up";
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		String actualFaceBookTitle=driver1.getTitle();
		
		if(actualFaceBookTitle==expectedFaceBookTitle)
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
	}

}
