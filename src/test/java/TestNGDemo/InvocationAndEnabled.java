package TestNGDemo;

import org.testng.annotations.Test;

public class InvocationAndEnabled {

	@Test(invocationCount = 2)
	public void m1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void m2() {
		System.out.println("Test case 2");
	}
	
	@Test(enabled = true)
	public void m3() {
		System.out.println("Test case 3");
	}
}
