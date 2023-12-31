package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("alert('Welcome')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
		jse.executeScript("prompt('Enter your password')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		jse.executeScript("confirm ('do you want go out')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
		driver.close();

	}

}
