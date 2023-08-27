package SeleniumT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRadio {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//lunch website
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@data-testid ='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		//click on radio button
	//	driver.findElement(By.id("email")).click();
		
		System.out.println("The output of the IsSelected "+driver.findElement(By.xpath("//input[@value='-1']")).isSelected());
		
		System.out.println("The output of the IsEnable "+driver.findElement(By.xpath("//input[@value='-1']")).isEnabled());
		
		System.out.println("The output of the IsDisplay "+driver.findElement(By.xpath("//input[@value='-1']")).isDisplayed());
		
		
		
		
		
		
		
				
	}

}
