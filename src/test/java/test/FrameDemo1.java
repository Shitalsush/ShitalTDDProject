package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tinymce");
		driver.manage().window().maximize();
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Shital");
		
	}
	

}
