package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hompage_Xpath extends DriverClass
{
	public static By AssignLeave_xpath=By.xpath("//button[@title=\"Assign Leave\"]");
	public static By assignleavepage_xpath=By.xpath("//h6[text()='Assign Leave']");
	public static By Employeename_xpath=By.xpath("//input[@placeholder=\"Type for hints...\"]");
	public static By LogoutBox_xpath=By.xpath("//span[@class=\"oxd-userdropdown-tab\"]");
	public static By Logout_xpath=By.xpath("//a[text()='Logout']");
	public static By Admin_xpath=By.xpath("//span[text()='Admin']");
	public static By AdminUsername_xpath=By.xpath("//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]//input[@class=\"oxd-input oxd-input--active\"]");
	public static By Adminpage_xpath=By.xpath("//span[text()='User Management ']");
	public static By PIM_xpath=By.xpath("//span[text()='PIM']")	;
	public static By pimpage_xpath=By.xpath("//span[text()='Configuration ']");
	public static By Search_xpath=By.xpath("//input[@placeholder='Search']");
	public static By leave_xpath=By.xpath("//span[text()='Leave']");
	public static By Time_xpath=By.xpath("//span[text()='Time']");
	public static By Recruitment_xpath=By.xpath("//span[text()='Recruitment']");
	public static By Myinfo_xpath=By.xpath("//span[text()='My Info']");
	public static By timePage_xpath=By.xpath("//span[text()='Timesheets ']");
	public static By RequritmentPage_xpath=By.xpath("//a[text()='Candidates']");
	public static By MyinfoPage_xpath=By.xpath("//a[text()='Personal Details']");  
	public static By Leavepage_xpath=By.xpath("//a[text()='Apply']");
	
	public static WebElement AssignLeaveWeb()
	{
		WebElement AssignLeaveWeb=d.findElement(AssignLeave_xpath);
		return AssignLeaveWeb;
	}
	public static void assignleavesendkeys()
	{
		AssignLeaveWeb().click();
	}
	public static WebElement EmployeenameWeb()
	{
		WebElement EmployeenameWeb=d.findElement(Employeename_xpath);
		return EmployeenameWeb;
	}
	public static void Employeenamesendkeys(String name)
	{
		EmployeenameWeb().click();
		EmployeenameWeb().sendKeys(name);
	}
	public static WebElement logoutboxWeb()
	{
		WebElement logoutboxWeb=d.findElement(LogoutBox_xpath);
		return logoutboxWeb;
	}
	public static WebElement adminpageWeb()
	{
		WebElement adminpageWeb=d.findElement(Adminpage_xpath);
		return adminpageWeb;
	}
	public static void logoutboxWebsendkeys()
	{
		logoutboxWeb().click();

	}
	public static WebElement logoutWeb()
	{
		WebElement logoutWeb=d.findElement(Logout_xpath);
		return logoutWeb;
	}
	public static void logoutsendkeys()
	{
		logoutWeb().click();
	}
	public static WebElement assignleavepageWeb()
	{
		WebElement assignleavepageWeb=d.findElement(assignleavepage_xpath);
		return assignleavepageWeb;
	}
	public static WebElement adminweb()
	{
		WebElement adminweb=d.findElement(Admin_xpath);
		return adminweb;
	}

	public static void adminwebsendkey()
	{
		adminweb().click();
	}
	public static WebElement AdminUsernameWeb()
	{
		WebElement AdminUsernameWeb=d.findElement(AdminUsername_xpath);
		return AdminUsernameWeb;
	}
	public static void AdminUsernamesendkey(String name)
	{
		AdminUsernameWeb().click();
		AdminUsernameWeb().sendKeys(name);
	}
	public static WebElement PIMWeb()
	{
		WebElement pimweb=d.findElement(PIM_xpath);
		return pimweb;
	}
	public static void pimsendkey()
	{
		PIMWeb().click();
	}
	public static WebElement pimpageweb()
	{
		WebElement pimpageweb=d.findElement(PIM_xpath);
		return pimpageweb;
	}
	public static WebElement SearchWeb()
	{
		WebElement search=d.findElement(Search_xpath);
		return search;
	}
	public static void Searchsendkey(String kavi)
	{
		SearchWeb().click();
		SearchWeb().sendKeys(kavi);
	}
	public static WebElement leaveWeb()
	{
		WebElement leaveWeb=d.findElement(leave_xpath);
		return leaveWeb;
	}
	public static void leavesendkey()
	{
		leaveWeb().click();
	}
	public static WebElement TimeWeb()
	{
		WebElement TimeWeb=d.findElement(Time_xpath);
		return TimeWeb;
	}
	public static void TimeWebsendkey()
	{
		TimeWeb().click();
	}
	public static WebElement RecruitmentWeb()
	{
		WebElement RecruitmentWeb=d.findElement(Recruitment_xpath);
		return RecruitmentWeb;
	}
	public static void RecruitmentWebsendkey()
	{
		RecruitmentWeb().click();
	}
	public static WebElement MyinfoWeb()
	{
		WebElement MyinfoWeb=d.findElement(Myinfo_xpath);
		return MyinfoWeb;
	}
	public static void MyinfoWebsendkey()
	{
		MyinfoWeb().click();
	}
	public static WebElement timepageWeb()
	{
		WebElement timepageWeb=d.findElement(timePage_xpath);
		return timepageWeb;
	}
	public static WebElement RecruitmentpageWeb()
	{
		WebElement RecruitmentpageWeb=d.findElement(RequritmentPage_xpath);
		return RecruitmentpageWeb;
	}
	public static WebElement MyinfopageWeb()
	{
		WebElement MyinfopageWeb=d.findElement(MyinfoPage_xpath);
		return MyinfopageWeb;
	}
	public static WebElement LeavepageWeb()
	{
		WebElement LeavepageWeb=d.findElement(Leavepage_xpath);
		return LeavepageWeb;
	}
}








