package com.internetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewcustomer {
	WebDriver driver;
	
	@FindBy(linkText="New Customer")
	WebElement Nclink;
	
	@FindBy(name="name")
	WebElement Csname;
	
	@FindBy(name="rad1")
	WebElement Genbttn;
	
	@FindBy(name="dob")
	WebElement date;
	
	@FindBy(name="addr")
	WebElement addrtxt;
	
	@FindBy(name="city")
	WebElement cty;
	
	@FindBy(name="state")
	WebElement st;
	
	@FindBy(name="pinno")
	WebElement pn;
	
	@FindBy(name="telephoneno")
	WebElement tn;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="sub")
	WebElement sbt;
	

	public Addnewcustomer(WebDriver rdriver) {
		driver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void NewCustomer() {
		Nclink.click();;
	}

public void Customername(String name) {
	Csname.sendKeys(name);
}

public void Gender() {
	Genbttn.click();
}
public void date(String dd,String mm,String yyyy) {
	date.sendKeys(dd);
	date.sendKeys(mm);
	date.sendKeys(yyyy);
}
public void address(String Addr) {
	addrtxt.sendKeys(Addr);
}
public void City(String City) {
	cty.sendKeys(City);
}
public void State(String State) {
	st.sendKeys(State);
}
public void Phoneno(String no) {
	pn.sendKeys(no);
}
public void Telephone(String TN) {
	tn.sendKeys(TN);
}
public void Email(String Email) {
	email.sendKeys(Email);
}

public void submit() {
	sbt.click();
}






}
