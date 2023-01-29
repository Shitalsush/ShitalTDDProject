package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(3000);
		String expMsg = "I am an alert box!";
		String actMsg =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		if(expMsg.equals(actMsg))
		{
			System.out.println("Test case 1 is passed");
		}
		else
		{
			System.out.println("Test case 2 is passed");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("shital");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
