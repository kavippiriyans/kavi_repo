package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{

	public static void main(String[] args) throws IOException
	{	
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.zomato.com/hyderabad");
		
		File file=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\pc\\Pictures\\Camera Roll\\img.png");
		FileHandler.copy(file, destination);
	
		WebElement textphoto=d.findElement(By.xpath("//h3[text()='Inspiration for your first order']"));
		File file1=((TakesScreenshot)textphoto).getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\pc\\Pictures\\Camera Roll\\img1.jpg");
		FileHandler.copy(file1, destination1);
		d.close();
	}
}
