package youtubeHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleYoutube 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		List<WebElement> vid = driver.findElements(By.id("video-title"));
		int i = vid.size();
		System.out.println("Size of list is:"+i);
		for (WebElement e : vid)
		{
			vid.get(2).click();
		}
	}
}