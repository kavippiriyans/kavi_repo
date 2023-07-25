package Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 
{

	@BeforeMethod
	public void beforemethod1() throws Exception
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
	public void aftermethod1() throws Exception
	{
		Hompage_Xpath.logoutboxWebsendkeys();
		Hompage_Xpath.logoutsendkeys();		
		OrangeHrmValidation.loginpageValidation(Loginpageclass.loginpageWebEle());
		DriverClass.quit();
		
	}
	@Test
	public static void testcase11() throws Exception
	{
		Hompage_Xpath.Searchsendkey("kavi");
		OrangeHrmValidation.search("kavii");	
	}
	@Test
	public static void testcase12() throws Exception
	{
		Hompage_Xpath.TimeWebsendkey();
		OrangeHrmValidation.timepage(Hompage_Xpath.timepageWeb());
	}
	@Test
	public static void testcase13() throws Exception
	{
		Hompage_Xpath.RecruitmentWebsendkey();
		OrangeHrmValidation.Recruitmentpage(Hompage_Xpath.RecruitmentpageWeb());
	}
	@Test
	public static void testcase14() throws Exception
	{
		Hompage_Xpath.leavesendkey();
		OrangeHrmValidation.leavepage(Hompage_Xpath.LeavepageWeb());
	}
	@Test
	public static void testcase15() throws Exception
	{
		Hompage_Xpath.MyinfoWebsendkey();
		OrangeHrmValidation.Myinfopage(Hompage_Xpath.MyinfoWeb());
	}

}
