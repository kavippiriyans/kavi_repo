package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username=d.findElement(By.xpath("//input[@name=\"username\"]"));

		Actions Act=new Actions(d);

		Act.moveToElement(username).click()
		.keyDown(username, Keys.SHIFT).sendKeys(username, "Admin").keyUp(username, Keys.SHIFT)
		.doubleClick().contextClick().build().perform();
	}

}

