package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor3 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username=d.findElement(By.xpath("//input[@name=\"username\"]"));
		JavascriptExecutor JSE=(JavascriptExecutor)d;
		//JSE.executeScript("document.getElementsByName('username')[0].value='Admin'");
		
		JSE.executeScript("arguments[0].value='Admin'", username);
	

	}

}
