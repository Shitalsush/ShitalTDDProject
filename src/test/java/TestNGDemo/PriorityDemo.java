package TestNGDemo;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = 1)
	public void a1() {
		System.out.println("A1");
	}
	
	@Test(priority = 3)
	public void b1() {
		System.out.println("B1");
	}
	
	@Test
	public void c1()
	{
		System.out.println("C1");
	}
	
	@Test(priority = -3)
	public void z1() {
		System.out.println("Z1");
	}
	
}
