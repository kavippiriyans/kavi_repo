package ChromeOptions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) 
	{
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.leafground.com/file.xhtml");
		
		By download=By.xpath("//span[text()='Download']");
		WebElement download_webelement=d.findElement(download);
		download_webelement.click();
		
		File download_location=new File("C:\\download");
		
	}

}
