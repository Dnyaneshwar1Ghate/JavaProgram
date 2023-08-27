
package SeleniumT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
	//	System.setProperty("webdriver.chrome.driver","F:\\Software\\driver\\chromedriver_win32\\chromedriver.exe");
	 	WebDriver driver =new FirefoxDriver();
	 	driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
//		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
	
		//1st way 
		
		List <WebElement> birthmonth=driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		System.out.println("total dropdwon values "+birthmonth.size());
		System.out.println(birthmonth.get(8).isEnabled());
		birthmonth.get(8).click();
		Thread.sleep(3000);
		//2nd way
		
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(bm);
		month.selectByVisibleText("Apr");
		month.selectByValue("12");
		month.deselectByIndex(10);
		
		System.out.println(month.getFirstSelectedOption().getText());
		
		
		
		Thread.sleep(3000);
		//3rd way
		
		WebElement bm1=driver.findElement(By.xpath("//select[@id='month']"));
		Select month1=new Select(bm1);
		
		List<WebElement>dropDown=month1.getOptions();
		for(int i=0;i<dropDown.size();i++)
		{
			String dropDownValues=dropDown.get(i).getText();
			if(dropDownValues.equalsIgnoreCase("Aug"))
			{
				dropDown.get(i).click();
			}
			
		}
		Thread.sleep(3000);
		//4th way
		
		//select
		
		System.out.println(month1.isMultiple());
		month1.selectByVisibleText("Dec");
		month1.selectByValue("10");
		month1.selectByIndex(10);
		
		Thread.sleep(3000);
		//deselect
		
		month1.deselectByVisibleText("Dec");
		month1.deselectByValue("10");
		month1.deselectByIndex(10);
		month1.deselectAll();
		Thread.sleep(3000);
		
		//5th way
		bm1.sendKeys("Feb");
		Thread.sleep(3000);
		
		//6th way
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
	}

}
