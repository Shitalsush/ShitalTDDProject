package Seleniumassignments;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Actions act = new Actions(driver);
		WebElement dragElement = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		act.dragAndDropBy(dragElement, 50, 50).build().perform();
		Thread.sleep(3000);
		System.out.println("Dropped");
	
		driver.quit();
	
	

    }

}
