package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("hp-widget__sfrom"));
		
		Actions ac = new Actions(driver);
		ac.click(from).perform();
		
		for (int i = 1; i<= 3;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.click(from).perform();
	}

}
