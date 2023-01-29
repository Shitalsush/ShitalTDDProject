package TestNGDemo;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitDemo {
	
	@Test
	public void waitDemo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandles());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		//ele.click();

		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
//		Thread.sleep(3000);
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> handles = driver.getWindowHandles();
		for(String a:handles)
		{
			System.out.println(a);
		}
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

		List<WebElement> list = driver.findElements(By.xpath("//span[text()='Practice Form']"));
		for(WebElement i:list)
		{
			System.out.println(i.getTagName());
			i.click();
		}
		
		
		driver.findElement(By.id("firstName")).sendKeys("Shital");
		driver.findElement(By.id("lastName")).sendKeys("Bhosale");
		driver.findElement(By.id("userEmail")).sendKeys("shitalpatil@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
		
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		WebElement calendr= driver.findElement(By.id("dateOfBirthInput"));
		wait1.until(ExpectedConditions.elementToBeClickable(calendr));
		js.executeScript("arguments[0].scrollIntoView()",calendr);
		calendr.click();
		Thread.sleep(3000);
		
		
		WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
		Select monthSelect = new Select(month);
		monthSelect.selectByValue("3");
		
		WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__month']")).click();
		driver.findElement(By.xpath("//div[text()='30']")).click();

		WebElement subject = driver.findElement(By.id("subjectsInput"));
		
		subject.sendKeys("h");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(subject, Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		
		
		driver.findElement(By.id("currentAddress")).sendKeys("Kolhapur");
		
		
		Dimension d = new Dimension(500, 900);
		driver.manage().window().setSize(d);
		//js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement destination=driver.findElement(By.xpath("//div[text()='Select State']"));
		js.executeScript("arguments[0].scrollIntoView()",destination);
        destination.clear();
        destination.click();
        destination.sendKeys("ut");
        Thread.sleep(2000);
        destination.sendKeys(Keys.ARROW_DOWN);
       // destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);
		
		
//		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(),'Select State')]"))));
//		    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#state > div"))));
//		    driver.findElement(By.xpath("//div[@id='state']//div[@class='css-1g6gooi']"));
//		  WebElement state = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/form[@id='userForm']/div[@id='stateCity-wrapper']/div/div[@id='state']/div/div/div/div[1]"));
//		    state.sendKeys("NCR");
//		    state.sendKeys(Keys.ENTER);
//		    
//		    driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
//		    driver.findElement(By.xpath("//body//div[@id='app']//div[@id='city']//div//div//div[2]"));
//		  WebElement city = driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/form[@id='userForm']/div[@id='stateCity-wrapper']/div/div[@id='city']/div/div/div/div[1]"));
//		    city.sendKeys("Delhi");
//		    city.sendKeys(Keys.ENTER);
		//js.executeAsyncScript("document.getElementById('state')");
//		WebElement state = driver.findElement(By.id("state"));
//		//js.executeScript("arguments[0].scrollIntoView()",state);
//		//state.sendKeys("U");
//		//act.sendKeys(state, Keys.ENTER).build().perform();
//		state.click();
//		
//		WebElement city = driver.findElement(By.id("city"));
//		state.sendKeys("L");
//		act.sendKeys(state, Keys.ENTER).build().perform();
		
		
		WebElement submit = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView()",submit);
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		driver.close();
		}
		
		
		
	

}
