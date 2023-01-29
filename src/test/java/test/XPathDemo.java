package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]")).sendKeys("Shital");
		
		
	}

}
