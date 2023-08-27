package SeleniumT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Software\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	driver.navigate().to("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement From =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[3]"));
		
		WebElement To =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));
		
		
		
		
		
		
		Actions builder=new Actions(driver);
		
		Action dragAndDrop=builder.clickAndHold(From).moveToElement(To).release(To).build();
		dragAndDrop.perform();
		
		
		
	}

}
