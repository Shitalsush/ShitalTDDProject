package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.navigate().to("http://selenium.dev");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
