package grid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTesting {


	 
    //protected ThreadLocal<RemoteWebDriver> threadDriver = null;

  
    	public static void main(String[] args) throws MalformedURLException {
    		
    		 WebDriver driver;
    		 BasicConfigurator.configure();
    		 
      
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
      capabilities.setCapability("FirefoxDriver.BINARY",new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
    
     driver = new RemoteWebDriver(new URL("http://192.168.2.33:5566/wd/hub"), capabilities);
         
       driver.get("https://www.google.com");
       System.out.println(driver.getTitle());
     
      
      
   
	     }
    }
   
