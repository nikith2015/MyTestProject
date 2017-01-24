package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	protected WebDriver driver;
	public void intialSetup() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vniki\\workspace\\Practice\\lib\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	
	    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void close()
	{
		driver.close();
		
	}
	
}