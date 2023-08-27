package SeleniumT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		/*driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		*/
	    WebElement r=	driver.findElement(By.className("_3704LK"));
	    r.sendKeys("iphone");
	    r.sendKeys(Keys.RETURN);
	    
	
		Thread.sleep(3000);
		
		
		/*
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(3000);
		*/
		
		
		WebElement w=driver.findElement(By.className("_4rR01T"));
		w.click();
		w.sendKeys(Keys.RETURN);
		driver.quit();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
		
	}

}
