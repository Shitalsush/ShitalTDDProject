package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mouseHover();
		//keyboardEvent();
		//scrollBy();
		dragDrop();
	}
	
	public static void mouseHover() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement kidmenu = driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions act = new Actions(driver);
		act.moveToElement(kidmenu).perform();
		//driver.close();
		
		//Right click
		driver.navigate().to("https://www.amazon.com/");
		WebElement grftcard = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		act.contextClick(grftcard).perform();
		
	}
	
	public static void keyboardEvent() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		String email = "shitalbhosale";
		Actions act = new Actions(driver);
		act.click(username).keyDown(Keys.SHIFT).sendKeys(email).keyUp(Keys.SHIFT).perform();	
		
	}
	
	public static void scrollBy() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		//act.scrollByAmount(0, 1000).perform();
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
		act.scrollToElement(menu).perform();
	}
	
	public static void dragDrop() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement f = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(f);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceElement, targetElement).perform();
		
	}

}
