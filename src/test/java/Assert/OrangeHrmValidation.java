package Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OrangeHrmValidation extends DriverClass
{


	public static void loginpageValidation(WebElement loginpage)
	{
		Assert.assertTrue(loginpage.isDisplayed(), "login page not displyed");
	}

	public static void EnteredUsernameValidation(String Actualusername ) 
	{
		Assert.assertEquals(Loginpageclass.usernameWebEle().getAttribute("value"),Actualusername,"Entered username is not displayed");

	}

	public static void EnteredPasswordValidation(String Actualpassword )
	{
		Assert.assertEquals(Loginpageclass.PasswordWebEle().getAttribute("value"), Actualpassword,"Entered password is not displyed");
	}



	public static void HomepageValidation(WebElement homepage) throws Exception
	{
		Assert.assertTrue(homepage.isDisplayed(), "Home page is not dispalyed");

	}
	
		public static void homepage(WebElement assignleavepage) throws Exception
		{
			Assert.assertTrue(assignleavepage.isDisplayed());
			
		}
		public static void assignleavetext(String leavetext) 
		{
			Assert.assertEquals(Hompage_Xpath.EmployeenameWeb().getAttribute("value"), leavetext, "the employee name is not correct");
			
		}
		public static void adminusername(String name) 
		{
			Assert.assertEquals(Hompage_Xpath.AdminUsernameWeb().getAttribute("value"),name,"username is not matched");
		}
	
		public static void adminpage(WebElement  name) throws Exception
		{
	         Assert.assertTrue(name.isDisplayed(), "adminpage is not displayed");
		}
		public static void pimpage(WebElement  name) throws Exception
		{
			Assert.assertTrue(name.isDisplayed(), "pimpage is not displayed");
		}
	
		public static void search(String  name) throws Exception
		{
			Assert.assertEquals(Hompage_Xpath.SearchWeb().getAttribute("value"), name, "Entered letter is not displayed");
		}
	
		public static void timepage(WebElement  name) throws Exception
		{
			Assert.assertTrue(name.isDisplayed(), "timepage is not displayed");
		}
	
		public static void leavepage(WebElement  name) throws Exception
		{
			Assert.assertTrue(name.isDisplayed(), "leavepage is not displayed");
		}
	
		public static void Myinfopage(WebElement  name) throws Exception
		{
			Assert.assertTrue(name.isDisplayed(), "Myinfopage is not displayed");
		}
	
		public static void Recruitmentpage(WebElement  name) throws Exception
		{
			Assert.assertTrue(name.isDisplayed(), "Recruitmentpage is not displayed");
		}
	





}


