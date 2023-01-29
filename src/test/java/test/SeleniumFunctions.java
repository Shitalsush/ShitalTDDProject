package test;

import java.io.File;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		
		File source = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(source, new File("./screenshots/element.png"));
		Thread.sleep(3000);
	}

}
