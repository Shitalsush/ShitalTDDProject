package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scrolling by some pixels
		//js.executeScript("window.scrollBy(0,700)");
		
		//scrolling by bottom of the page
		//js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//scrolling to specific element
		WebElement target = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
		js.executeScript("arguments[0].scrollIntoView()",target);
		
		
		
	}

}
