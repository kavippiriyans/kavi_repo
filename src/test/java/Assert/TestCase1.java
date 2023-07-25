package Assert;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase1 
{


	@BeforeMethod
	public void beforemethod() throws Exception
	{
		DriverClass.WebDriver();
		Loginpageclass.usernamekeys("Admin");
		OrangeHrmValidation.EnteredUsernameValidation("Admin");

		Loginpageclass.passwordkeys("admin123");	
		OrangeHrmValidation.EnteredPasswordValidation("admin123");

		Loginpageclass.loginbuttonkeys();
		OrangeHrmValidation.HomepageValidation(Loginpageclass.HomepageWebEle());	


	}

	@AfterMethod
	public void aftermethod() 
	{
		Hompage_Xpath.logoutboxWebsendkeys();
		Hompage_Xpath.logoutsendkeys();		
		OrangeHrmValidation.loginpageValidation(Loginpageclass.loginpageWebEle());
		DriverClass.quit();

	}

	@Test
	public static void testcase1_assignleaves() throws Exception
	{
		Hompage_Xpath.assignleavesendkeys();
		OrangeHrmValidation.homepage(Hompage_Xpath.assignleavepageWeb());

		Hompage_Xpath.Employeenamesendkeys("Lisa  Andrews");
		OrangeHrmValidation.assignleavetext("Lisa  Andrews");


	}
	@Test(dependsOnMethods="testcase1_assignleaves")
	public static void testcase2_admin() throws Exception
	{

		Hompage_Xpath.adminwebsendkey()	;
		OrangeHrmValidation.adminpage(Hompage_Xpath.adminpageWeb());	
		Hompage_Xpath.AdminUsernamesendkey("Lisa  Andrews");		
		OrangeHrmValidation.adminusername("Lisa  Andrews");	

	}
	@Test(priority=3,groups={"admin","payment"})
	public static void testcase3_pim() throws Exception
	{
		Hompage_Xpath.pimsendkey();
		OrangeHrmValidation.pimpage(Hompage_Xpath.PIMWeb());


	}
}