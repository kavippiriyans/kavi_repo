package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/");
	  JavascriptExecutor JSE=(JavascriptExecutor)d;
	  
	  JSE.executeScript("window.scroll(0,3000)");
	  Thread.sleep(2000);
	  Thread.sleep(2000);
	  JSE.executeScript("window.scroll(0,-3000)");
	  
	  JSE.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  By elementvisible=By.xpath("//span[text()='Flat 45% off | Furnitures from stores nearby']");
	  WebElement element=d.findElement(elementvisible);
	  
	  
	  JSE.executeScript("arguments[0].scrollIntoView(true);",element);
	 
	}

}
