package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupByDemo {

	@Test(groups = "smoke")
	public void validateLogin() {
		System.out.println("Validate Login");
	}
	
	@Test(groups = "smoke")
	public void validateTitle() {
		System.out.println("Validate title");
	}
	
	@Test(groups = "regression")
	public void validateMonthlyReport() {
		System.out.println("Validate title");
	}
	
	@Test(groups = "regression")
	public void validateAnnualReport() {
		System.out.println("Validate title");
	}
	
	@Test(groups = {"regression","report"})
	public void validateNotification() {
		System.out.println("Validate title");
	}
}
