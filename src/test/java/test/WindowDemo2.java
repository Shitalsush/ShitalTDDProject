package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		//String pWindow = driver.getWindowHandle();
		//System.out.println(pWindow);
		System.out.println("Parent window title is "+driver.getTitle());
		
		WebElement swtichToDropdown = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]"));
		swtichToDropdown.click();
		
		WebElement switchOption = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a"));
		switchOption.click();
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		String pWid = it.next();
		System.out.println("Parent Window ID is "+pWid);
		String cWId = it.next();
		System.err.println("Child Window ID is "+cWId);
		
		driver.switchTo().window(cWId);
		System.out.println("Child Window title is "+driver.getTitle());
		driver.close();
		
		//for second tab
		driver.switchTo().window(pWid);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		
		Set<String> h1 = driver.getWindowHandles();
		Iterator<String> it1= h1.iterator();
		String pWid1 = it1.next();
		System.out.println("Parent Window ID is "+pWid1);
		String cWId1 = it1.next();
		System.err.println("Child Window ID is "+cWId1);
		
		driver.switchTo().window(cWId1);
		System.out.println("Child Window title is "+driver.getTitle());
		driver.close();
		
		
		//for third tab
		
		driver.switchTo().window(pWid);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		
		Set<String> h2 = driver.getWindowHandles();
		for(String s:h2)
		{
			System.out.println(s);
		}
		
		Iterator<String> it2 = h2.iterator();
		String pid = it2.next();
		System.out.println("Parant id is "+pid);
		
		String c1id = it2.next();
		System.out.println("Child window 1 id is "+c1id);
		String c2id = it2.next();
		System.out.println("Child window 1 id is "+c2id);
	
		
		driver.switchTo().window(c1id);
		System.out.println("Child window 1 title is "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(c2id);
		System.out.println("Child Window 2 title is "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(pid);
		driver.close();
	}

}
