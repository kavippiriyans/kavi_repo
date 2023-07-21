package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().window().maximize();
		d.get("https://www.abhibus.com/");
		
		String year="2023";
		String date="30";
		String month="july";


		WebElement calendarfile=d.findElement(By.xpath("//input[@id=\"datepicker1\"]"));
		calendarfile.click();
	
		List<WebElement>tablelist=d.findElements(By.xpath("//table//tbody//td"));
		for(WebElement list:tablelist)
		{
			System.out.println("elements "+list.getText());
			
			if(list.getText().equals(date))
			{
				System.out.println("Your choosen date is "+list.getText());
				if(list.isEnabled())
				{
					list.click();
				
					break;
				}
			}
		}
		
	}
}
