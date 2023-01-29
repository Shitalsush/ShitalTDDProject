package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.orangehrm.com");
		
		driver.findElement(By.linkText("Book a Free Demo")).click();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement a : links)
		{
			System.out.println(a.getText());
		}
		
		driver.close();
	}

}
