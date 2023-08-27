
package SeleniumT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		//System.setProperty("webdriver.chrome.driver","F:\\Software\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.calculator.net/percent-calculator.html");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("cpar1")).sendKeys("10");
		Thread.sleep(5000);

		String Res=driver.findElement(By.xpath("cpar1")).getAttribute("value");
		System.out.println("Result"+Res);
		driver.close();
		
	}

}
