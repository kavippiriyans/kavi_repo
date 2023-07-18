package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		d.get("https://www.google.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)d;
		Thread.sleep(2000);
		jse.executeScript("window.location.reload(true)");// Refresh

	}

}
