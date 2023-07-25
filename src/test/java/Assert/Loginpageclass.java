package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageclass extends DriverClass
{

	static By loginpage_xpath=By.xpath("//h5[text()='Login']");
	static By Username_xpath=By.xpath("//input[@name='username']");
	static By Password_xpath=By.xpath("//input[@name='password']");
	static By Loginbutton_xpath=By.xpath("//button[text()=' Login ']");
	static By Homepage=By.xpath("//img[@alt='client brand banner']");
	static By IuserVpass_xpath=By.xpath("//p[text()='Invalid credentials']");
	static By NullUserVPass_xpath=By.xpath("//span[text()='Required']");
	
	public static WebElement loginpageWebEle()
	{
		WebElement loginpage=d.findElement(loginpage_xpath);
		return loginpage;
	}
	
	public static WebElement usernameWebEle()
	{
		WebElement username=d.findElement(Username_xpath);
		return username;
	}
	
	public static WebElement PasswordWebEle()
	{
		WebElement password=d.findElement(Password_xpath);
		return password;
	}
	
	public static WebElement loginbuttonWebEle()
	{
		WebElement loginbutton=d.findElement(Loginbutton_xpath);
		return loginbutton;
	}
	
	public static WebElement IuserVpassWebEle()
	{
		WebElement IuserVpass=d.findElement(IuserVpass_xpath);
		return IuserVpass;
	}
	
	public static WebElement HomepageWebEle()
	{
		WebElement homepage=d.findElement(Homepage);
		return homepage;
	}
	
	public static WebElement NullUserVPassWebEle()
	{
		WebElement NullUserVPass=d.findElement(NullUserVPass_xpath);
		return NullUserVPass;
	}
	
	public static void usernamekeys(String username)
	{
		usernameWebEle().click();
		usernameWebEle().sendKeys(username);
	}
	
	public static void passwordkeys(String password)
	{
		PasswordWebEle().click();
		PasswordWebEle().sendKeys(password);
	}
	
	public static void loginbuttonkeys()
	{
		loginbuttonWebEle().click();
	}
	
}
