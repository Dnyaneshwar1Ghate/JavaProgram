package JavaProgram;

//import java.util.concurrent.TimeUnit;

public class Amazon_Auto {

	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "F:\\\\Software\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
        //driver.manage().window().maximize();
       
       // implicit 
       //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     /*  driver.get("https://www.amazon.in/");
       driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
      Thread.sleep(3000);
      driver.findElement(By.id("ap_email")).sendKeys("dghate2013@gmail.com");
      //continue
      driver.findElement(By.id("continue")).click();
      driver.findElement(By.id("ap_password")).sendKeys("9767101438");
      
      //auth-signin-button
      driver.findElement(By.id("auth-signin-button")).click();
      
       */
	}
}
