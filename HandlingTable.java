package SeleniumT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
	//	System.setProperty("webdriver.chrome.driver","F:\\Software\\driver\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver =new ChromeDriver();
		
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> allcompines=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total compines:----"+allcompines.size());
		
		                              
		List<WebElement>currentCompines =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total compines: ----"+currentCompines.size());
		
		String expCompany="palash Securities";
		for(int i=0;i<allcompines.size();i++)
		{
			if(allcompines.get(i).getText().equalsIgnoreCase(expCompany))
			{
				allcompines.get(i).click();
				break;
				
			}
		}
		
		


	}

}
