package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://book.spicejet.com/retrievebooking.aspx");
		Actions act=new Actions(d);
		
		By Moveelement=By.xpath("//a[@id='Login']");
		WebElement Move=d.findElement(Moveelement);
		act.moveToElement(Move).build().perform();//Move the cursor
		
		By doubleclick=By.xpath("//a[@id='TravelAgentLoginText']");
		WebElement doubleclickWeb=d.findElement(doubleclick);
		act.doubleClick(doubleclickWeb).build().perform();//double click
		
		By context=By.xpath("//a[@href='GetPage.aspx?pg=https://corporate.spicejet.com/Airports.aspx']");
		WebElement contextclick=d.findElement(context);
		act.contextClick(contextclick).build().perform();//RightClick
		
	}

}
