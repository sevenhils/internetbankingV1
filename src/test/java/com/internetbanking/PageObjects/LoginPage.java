package com.internetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	WebDriver driver;
	@FindBy(name="uid")
	WebElement uname;

	@FindBy(name="password")
	WebElement pswd;
	
	
	@FindBy(name="btnLogin")
	WebElement lgbttn;

	@FindBy(xpath="/html/body/div[3]/div/ul/li[10]/a")
	WebElement logout;

	
	public LoginPage(WebDriver rdriver) {
		driver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void SetUsername(String Uname) {
	
		uname.sendKeys(Uname);
			}
	public void password(String Pswd) {
		
		pswd.sendKeys(Pswd);
			}
	
	public void click() {
		lgbttn.click();
		
			}
	
	public void logoutclick() {
		logout.click();	
	}
	
}
