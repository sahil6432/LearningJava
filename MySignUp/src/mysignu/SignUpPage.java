package mysignu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage 
{	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement first_name =	driver.findElement(By.name("firstname"));
		first_name.sendKeys("Sahil");
		
		WebElement last_name = driver.findElement(By.name("lastname"));
		last_name.sendKeys("Goyal");
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("1234567890");
		
		WebElement new_password = driver.findElement(By.name("reg_passwd__"));
		new_password.sendKeys("sahilsahil");
		
		WebElement day_drop = driver.findElement(By.cssSelector("select[id='day']"));
		Select s= new Select(day_drop);
		s.selectByIndex(1);
		
		WebElement month_drop = driver.findElement(By.cssSelector("select[name='birthday_month']"));
		Select s1 = new Select(month_drop);
		s1.selectByValue("1");
		
		WebElement year_drop = driver.findElement(By.cssSelector("select[id='year']"));
		Select s2 = new Select(year_drop);
		s2.selectByVisibleText("1991");
		
		WebElement radio1 = driver.findElement(By.cssSelector("input[value='2']"));
		radio1.click();
		
		WebElement submit_button = driver.findElement(By.name("websubmit"));
		submit_button.click();
		
		//driver.close();
	}
}