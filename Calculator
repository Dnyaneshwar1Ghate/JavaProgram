package SeleniumT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calculator1 {

		public static void main(String[] args) throws Exception {
			
			//WebDriver driver =new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver", "F:\\\\Software\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.navigate().to("https://www.calculator.net/percent-calculator.html");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("cpar1")).sendKeys("10");
			Thread.sleep(3000);
			
			String result=driver.findElement(By.id("cpar1")).getAttribute("value");
			
			System.out.println("The Result is :-"+result);
			
			driver.findElement(By.id("cpar2")).sendKeys("2000");
			Thread.sleep(3000);
			
			String rlt =driver.findElement(By.id("cpar2")).getAttribute("value");
			System.out.println("The Second Value is :-" + rlt);
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
			
			Thread.sleep(3000);
			
			String Re =driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]")).getAttribute("value");
			System.out.println("Total is :-" +Re);
			Thread.sleep(3000);
			
			driver.close();

			
			
		}
	
}
