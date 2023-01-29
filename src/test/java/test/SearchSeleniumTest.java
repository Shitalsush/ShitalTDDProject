package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		
		driver.close();

	}

}
