package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales");
		
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Shital");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("shitalpatil9599@gmail.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9588667151");
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("Teacher");
		driver.findElement(By.id("Form_getForm_Comment")).sendKeys("Blablabla");
		
		
		WebElement dropElement = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select dropDownEmp = new Select(dropElement);
		
		//dropDownEmp.selectByIndex(3);
		dropDownEmp.selectByValue("11 - 15");
		//dropDownEmp.selectByVisibleText("0 - 10");
		
		
		WebElement dropEmp = driver.findElement(By.id("Form_getForm_Country"));
		Select dropDownEmp1 =new Select(dropEmp);
		
		dropDownEmp1.selectByValue("India");
	}

}
