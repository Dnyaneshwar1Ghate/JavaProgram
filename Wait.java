package SeleniumT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Software\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	
		Thread.sleep(3000);
		
		WebDriver wt=(WebDriver) new WebDriverWait(driver,60);
		//wt.until(ExceptedConditions.visiblityofElementLocated(By.id("pass"))).sendkeys("12345");
		
	}

}
