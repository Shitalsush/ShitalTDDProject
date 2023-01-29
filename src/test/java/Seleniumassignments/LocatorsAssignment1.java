package Seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropCountry= driver.findElement(By.name("country"));
		Select dropDownCountry=new Select(dropCountry);
		
		dropDownCountry.selectByValue("KUWAIT");
		
	}

}
