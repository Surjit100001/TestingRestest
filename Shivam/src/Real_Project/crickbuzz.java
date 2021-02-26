package Real_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbuzz 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOVIND KOCHAR\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scores/32258/ind-vs-eng-3rd-test-england-tour-of-india-2021");
		List<WebElement> score = driver.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-min-itm-rw ng-scope\"]"));
		
		for(int i=0; i<score.size(); i++)
		{
			String scorecard = score.get(i).getText();
			System.out.print(scorecard);
		}
	}

}
