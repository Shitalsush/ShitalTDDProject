package Seleniumassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InvokeWebDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new InternetExplorerDriver();
		//driver=new FirefoxDriver();
		
		driver=new ChromeDriver();
	
		driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		
		
	}

}
