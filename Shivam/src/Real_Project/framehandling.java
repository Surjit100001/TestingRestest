package Real_Project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling 
{

	public static void main(String[] args)
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://classic.crmpro.com/");
         
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         String parent = driver.getWindowHandle();
         
         driver.findElement(By.linkText("Sign Up")).click();
         driver.findElement(By.linkText("Pricing")).click();
         driver.findElement(By.linkText("Features")).click();
         driver.findElement(By.linkText("Customers")).click();
         
        Set<String> handles = driver.getWindowHandles();
        
        for(String child:handles)
        {
        	driver.switchTo().window(child);
        	System.out.println(driver.getTitle());
        }
        
        driver.switchTo().window(parent);
         
	}

}
