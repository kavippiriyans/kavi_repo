package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts 
{

	public static void main(String[] args)
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://demoqa.com/alerts");
		
		WebElement click=d.findElement(By.xpath("//button[@id='alertButton']"));
		click.click();
		d.switchTo().alert().accept();
		

	}

}
