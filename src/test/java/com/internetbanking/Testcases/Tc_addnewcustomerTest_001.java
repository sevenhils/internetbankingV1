package com.internetbanking.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetbanking.PageObjects.Addnewcustomer;
import com.internetbanking.PageObjects.LoginPage;

public class Tc_addnewcustomerTest_001 extends BaseClass{
	
	@Test
	public void NewCustomer() throws InterruptedException, IOException {
	LoginPage lp=new LoginPage(driver);
	
	lp.SetUsername(username);
	logger.info("Entered Username");

	lp.password(password);
	logger.info("Entered password");

	lp.click();
	Thread.sleep(3000);

	Addnewcustomer adc=new Addnewcustomer(driver);
	
	adc.NewCustomer();
	logger.info("providing customer details....");
	adc.Customername("venkatesh");
	
	adc.Gender();
	adc.date("10", "02", "1998");
	Thread.sleep(3000);

	adc.address("h-no:12/A,sricolony");
	adc.City("hyd");
	adc.State("telangana");
	adc.Phoneno("7999212312");
	adc.Telephone("04012047651");
	
	Thread.sleep(3000);

	String email=randomestring()+"@gmail.com";
	adc.Email(email);
	adc.Email("abcdef");
	
	adc.submit();

	Thread.sleep(3000);

boolean res =	driver.getPageSource().contains("Customer Registered Successfully!!!");

	if(res==true) {
		Assert.assertTrue(true);
		logger.info("Test case passed");
	}
		else {
			logger.info("Test Case failed");
			captureScreen(driver, "NewCustomer");
			Assert.assertTrue(false);
		}
	}

	
	}

