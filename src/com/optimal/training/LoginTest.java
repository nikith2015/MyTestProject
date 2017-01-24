package com.optimal.training;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@DataProvider
	
	public Object[][] getUserCredentialsTestData(){
		return new Object[][]
		{
			{"naanirocks@gmail.com", "pass"},
			{"pandu.nishanth93@gmail.com","pass1"},
			{"niki.viru@gmail.com","passssss"}
		};
	}

@Test(dataProvider = "getUserCredentialsTestData")

public void testingwithcorrectdataandincorrectpassword(String userName, String password) throws InterruptedException{
	
	initialSetup();
	LogInPage logInpage = new LogInPage(driver);
	logInpage.login(userName, password);
	
		WebElement passwordLabelElement = driver.findElement(By.xpath(".//*[@id='js_0']/div/div/div")); 
WebDriverWait webDriverWait = new WebDriverWait(driver,30);

webDriverWait.pollingEvery(5, TimeUnit.SECONDS);
webDriverWait.until(ExpectedConditions.visibilityOf(passwordLabelElement));
		
		System.out.println(passwordLabelElement.getText());
		String ActualText = passwordLabelElement.getText();
		String ExpectedText = "The password that you've entered is incorrect. Forgotten password?";
		Assert.assertEquals(ActualText,ExpectedText );				
			
}
}

/*@Test(dataProvider = "getUserCredentialsTestData")

void testingwithcorrectdataandcorrectpassword(String userName, String password) throws InterruptedException {
	
			initialSetup();
			LogInPage logInpage = new LogInPage(driver);
			logInpage.login(userName, password);
			
			
			WebElement passwordLabelElement = driver.findElement(By.xpath(".//*[@id='u_0_1']/div[1]/div[1]/div/a/span")); 
			System.out.println(passwordLabelElement.getText());
			
			String ActualText = passwordLabelElement.getText();
			String ExpectedText = "Nishanth";
			Assert.assertEquals(ActualText,ExpectedText );
			
		}	
	}
*/
