package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		d.get("https://jqueryui.com/slider/");
		
		d.switchTo().frame(0);
		
		WebElement slider=d.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions act=new Actions(d);
		
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
		

	}

}
