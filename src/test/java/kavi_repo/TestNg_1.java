package kavi_repo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_1 
{

	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Beforeclass1");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Afterclass1");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println(" before method class1");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println(" after method class1");
	}
	
@Test
	public void m1()
	{
		System.out.println(" m1,class1");
	}
@Test(priority=1,groups={"dashboard","payment"})
	public void M2()
	{
		System.out.println(" m2,class1");
	}
@Test(enabled=false)
	public void m3()
	{
		System.out.println(" m3,class1");
	}
@Test(enabled=false)
	public void m4()
	{
		System.out.println(" m4,class1");
	}
@Test(priority=0,groups= {"dashboard","payment"})
	public void m5()
	{
		System.out.println(" m5,class1");
	}
}
