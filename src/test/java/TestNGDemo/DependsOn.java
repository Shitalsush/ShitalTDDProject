package TestNGDemo;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsOn {

	@Test
	public void login() {
		System.out.println("Validate Login");
		org.testng.Assert.fail();
	}
	
	@Test(dependsOnMethods = "login")
	public void validateNewsFeeds() {
		System.out.println("Validate news feeds");
	}
	
	@Test
	public void validateSendFrndRequest() {
		System.out.println("Sending friend request");
		//org.testng.Assert.fail();
	}
	
	@Test(dependsOnMethods = {"login","validateSendFrndRequest"})
	public void validateAcceptingFrndRequest() {
		System.out.println("Accepting Friend request");
	}
	
}
