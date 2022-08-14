package testng;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTestNG {

	@BeforeSuite
	public void a() {
		
		System.out.println("I am in method 1");
	}
	
	@BeforeGroups("smoke")
	public void beforeTestMethod() {
		System.out.println("before group");
	}
	
	@Test(groups = {"smoke"} )
	public void c() {
		
		System.out.println("I am in method 2");
		
	}

	@Test(groups = {"smoke"} )
	@Parameters("10")
	public void c1(int a) {
		System.out.println(a);
		System.out.println("I am in method c1");
		
	}
	
	@Test()
	public void b() {
		System.out.println("I am in method 3");
	}
	
	
	
}
