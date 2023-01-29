package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/practiceform/");
		
		//String pWindow = driver.getWindowHandle();
		//System.out.println(pWindow);
		System.out.println("On Parent Window "+driver.getTitle());
		
		driver.findElement(By.id("button1")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String a:handles)
		{
			System.out.println(a);
		}
		
		Iterator<String> i = handles.iterator();
		String pWindow =i.next();
		System.out.println("Parent Window id is "+pWindow);
		String cWindow = i.next();
		System.out.println("Child Window id is "+cWindow);
		
		driver.switchTo().window(cWindow);
		System.out.println("On Child Window "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(pWindow);
		driver.close();
	}

}
