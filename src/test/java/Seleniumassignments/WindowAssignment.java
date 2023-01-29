package Seleniumassignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		//String pWinId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String pWinID = it.next();
		String cWinID = it.next();
		
		driver.switchTo().window(cWinID);
		driver.findElement(By.name("emailid")).sendKeys("shital@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(pWinID);
		driver.close();
	}

}
