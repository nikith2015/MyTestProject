package com.optimal.training;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {

	protected WebDriver driver;
	public void initialSetup() throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vniki\\workspace\\Practice\\lib\\chromedriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait webDriverWait = new WebDriverWait(driver,5);
		//webDriverWait.pollingEvery(1, TimeUnit.SECONDS);
	}

	public void close()
	{
		driver.close();
	}
	
	
	
}
