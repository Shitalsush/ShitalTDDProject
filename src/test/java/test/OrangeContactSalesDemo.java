package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeContactSalesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Shital Bhosale");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("00000000");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("Teacher");
		driver.findElement(By.id("Form_getForm_Comment")).sendKeys("Blablabla");
		
		
	}

}
