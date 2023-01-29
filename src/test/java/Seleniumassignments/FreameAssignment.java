package Seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreameAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		 driver.switchTo().frame("a077aa5e");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/a/img")).click();
		 Thread.sleep(3000);
		 
		// driver.quit();
	}

}
