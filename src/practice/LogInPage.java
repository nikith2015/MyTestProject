package practice;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//public class BaseTest {
public class LogInPage extends BasePage {


@BeforeMethod			

public void beforeTest(){
System.out.println("Before Test Call");

}
			
@AfterMethod

public void afterTest(){
			
	System.out.println("After Test call");
	//close();
		
}


@DataProvider
public Object[][] getUserCredentialsTestData(){
	return new Object[][]
	{
		  {"Nikith","V", "3302527248" ,"3302527248","ABC"},
		  {"Subbu", "G", "3302578978", "3302578978", "DEF"}
};
}

@Test(dataProvider = "getUserCredentialsTestData")			
public void testingwithcorrectdataandincorrectpassword(String FirstName, String LastName, String Number,String Number2, String Password) throws InterruptedException{
			
			intialSetup();
Thread.sleep(1000);
			WebElement FirstElement = driver.findElement(By.xpath(".//*[@id='u_0_1']"));
	        FirstElement.sendKeys(FirstName);
				        WebElement LastElement = driver.findElement(By.xpath(".//*[@id='u_0_3']"));  
			LastElement	.sendKeys(LastName);
			
			WebElement NumberElement = driver.findElement(By.xpath(".//*[@id='u_0_5']"));  
			NumberElement.sendKeys(Number);
			
			WebElement ReNumElement = driver.findElement(By.xpath(".//*[@id='u_0_8']"));
			ReNumElement.sendKeys(Number2);
			
			WebElement PasswordElement = driver.findElement(By.xpath(".//*[@id='u_0_a']"));
			PasswordElement.sendKeys(Password);
			
			Select Month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
			Month.selectByIndex(1);
			
			Select Day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
			Day.selectByIndex(9);
			
			Select Year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
			Year.selectByIndex(10);
			
			
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id='u_0_l']"));   
			loginbutton.click(); 
								
	     	Thread.sleep(3000);
						
			/*WebElement passwordLabelElement = driver.findElement(By.xpath(".//*[@id='js_0']/div/div/div")); 
			System.out.println(passwordLabelElement.getText());
			String ActualText = passwordLabelElement.getText();
			String ExpectedText = "The password that you've entered is incorrect. Forgotten password?";
			Assert.assertEquals(ActualText,ExpectedText );
				*/		
			Thread.sleep(3000);
						
					
			}
//@Test


	void testingwithcorrectdataandcorrectpassword() throws InterruptedException{
			
	intialSetup();		
	
			WebElement emailElement = driver.findElement(By.xpath(".//*[@id='email']"));
			emailElement.sendKeys("pandu.nishanth93@gmail.com");
			WebElement passwordElement = driver.findElement(By.xpath(".//*[@id='pass']"));  
			passwordElement	.sendKeys("lxxxxxx");
			WebElement loginbutton = driver.findElement(By.xpath("//*[@id='u_0_l']"));   
			loginbutton.click(); 
							
			Thread.sleep(3000);
			
			WebElement passwordLabelElement = driver.findElement(By.xpath("")); 
			System.out.println(passwordLabelElement.getText());
					
			String ActualText = passwordLabelElement.getText();
			String ExpectedText = "Nishanth";
			Assert.assertEquals(ActualText,ExpectedText );
					
			Thread.sleep(3000);
					
					
		}
			
					
				
			}