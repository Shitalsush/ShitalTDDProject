package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Shital");
		driver.switchTo().alert().accept();
		
		String expMsg = "I am an alert box!";
		//test case 1
		driver.findElement(By.id("alertexamples")).click();
		String actMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		if(expMsg.equals(actMsg))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		//test case 2
		
		String expMsg1 = "I am a confirm alert";
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(3000);
		String actMsg1 = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		if(expMsg1.equals(actMsg1))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		//test case 3
		String expMsg2 = "I prompt you";
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		String actMsg2=driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Shital");
		driver.switchTo().alert().accept();
		
		if(expMsg2.equals(actMsg2))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		//driver.close();
	}

}
