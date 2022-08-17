package testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		Thread.sleep(3000);
	    System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
