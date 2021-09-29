package com.internetbanking.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetbanking.PageObjects.LoginPage;

public class Tc_LoginTest_001  extends BaseClass{
	
	
	@Test
	public void logintest() throws IOException {
		driver.get(baseurl);
		logger.info("Url is opened");
		
		
		LoginPage lp=new LoginPage(driver);
		lp.SetUsername(username);
		logger.info("Entered Username");
		lp.password(password);
		logger.info("Entered password");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Home Page")) {
			Assert.assertTrue(true);
			logger.info("testcase is passed");
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("testcase is failed");
		}
		
	 }
	
	

}
