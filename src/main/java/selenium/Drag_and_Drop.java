package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		Actions a= new Actions(d);

		d.get("https://demoqa.com/droppable/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.manage().window().maximize();


		By drag=By.xpath("//div[@id=\"draggable\"]");
		WebElement drag_button=d.findElement(drag);

		By drop=By.xpath("//p[text()='Dropped!']");
		WebElement drop_button=d.findElement(drop);

		a.dragAndDrop(drag_button, drop_button).build().perform();
	}

}
