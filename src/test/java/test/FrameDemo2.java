package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleFrame();
		frameInFrame();
	}
	
	public static void singleFrame() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		String pWindow = driver.getWindowHandle();
		System.out.println(pWindow);
		WebElement swtichToDropdown = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]"));
		swtichToDropdown.click();
		
		WebElement switchOption = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
		switchOption.click();
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).clear();
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("shital");
		driver.close();
	}
	
	public static void frameInFrame() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		String pWindow = driver.getWindowHandle();
		System.out.println(pWindow);
		WebElement swtichToDropdown = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]"));
		swtichToDropdown.click();
		
		WebElement switchOption = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
		switchOption.click();
		
		WebElement frameWithFrame = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		frameWithFrame.click();
		
	//	WebElement f = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		WebElement f = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(f);
		WebElement f1 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("shital");
		
		driver.close();
	
	}

}
