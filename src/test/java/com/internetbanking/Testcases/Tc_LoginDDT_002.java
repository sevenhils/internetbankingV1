package com.internetbanking.Testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.internetbanking.PageObjects.LoginPage;
import com.internetbanking.Utilits.XLUtils;

public class Tc_LoginDDT_002 extends BaseClass {
	
	
	@Test(dataProvider="Login")
	public void LoginTest(String Usname,String pswd) throws InterruptedException, IOException {
		
		LoginPage lp=new LoginPage(driver);
		lp.SetUsername(Usname);
		logger.info("Entered Username");
		lp.password(pswd);
		logger.info("Entered password");
		lp.click();
		Thread.sleep(3000);
		
		if(isAlertpresent()==true) {
			captureScreen(driver,"loginTest");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Testcase failed");
		}
		else {
			Assert.assertTrue(true);
			logger.info("testcase passed");
			Thread.sleep(3000);

			lp.logoutclick();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
}
	public boolean isAlertpresent() {
		
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
		
		}
	
	@DataProvider(name="Login")
	String[][] getData() throws IOException  
	{
		
	String path=System.getProperty("user.dir")+"/src/test/java/com/internetbanking/testdata/LoginData.xlsx";
	
	int rownum=XLUtils.getRowCount(path, "Sheet1");
	int colcount=XLUtils.getCellCount(path,"Sheet1",1);
	
	String logindata[][]=new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
		}
			
	}
return logindata;
	
}
}
