
package SeleniumT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Software\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.paytm.com");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div[2]/div")).click();
		Thread.sleep(3000);

		int allFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(allFrame);

		for (int i = 0; i < allFrame; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(test(),'watch video')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='close']")).click();
		}

	}
}
