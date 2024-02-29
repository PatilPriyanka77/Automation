package Test_Packages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test123 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Method");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");	
	}
	
	@Test
	public void test()
	{
	System.out.println("test");		
	}
	
	@AfterMethod
	public void aftermethod()
	{ 
		System.out.println("After Method");		
	}
    @AfterClass
    public void afterclass()
    {
    System.out.println("After class");	
    }
}



