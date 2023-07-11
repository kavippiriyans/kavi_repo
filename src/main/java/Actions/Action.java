package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://book.spicejet.com/retrievebooking.aspx");
		Actions act=new Actions(d);
		act.moveToElement(d.findElement(By.xpath("//a[@id='Login']"))).build().perform();//Move the cursor
		act.doubleClick(d.findElement(By.xpath("//a[@id='TravelAgentLoginText']"))).build().perform();//double click
		act.contextClick(d.findElement(By.xpath("//a[@href=\"GetPage.aspx?pg=https://corporate.spicejet.com/Airports.aspx\"]")))
		.build().perform();//RightClick
	}

}
