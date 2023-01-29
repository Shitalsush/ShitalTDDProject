package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.get("https://spicejet.woohoo.in/home");
		driver.findElement(By.linkText("FAQ")).click();
		driver.findElement(By.linkText("T&C")).click();
		driver.findElement(By.linkText("CHECK BALANCE")).click();
		driver.findElement(By.linkText("CORPORATE GIFTING")).click();
		
	}

}
