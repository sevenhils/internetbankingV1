package com.internetbanking.Utilits;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Readconfig {

Properties pro;
	
	public Readconfig()
	{
		File src = new File("C:\\Users\\ADMIN\\eclipse-workspace\\internetbankingV1\\configruation\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");

	return password;
}
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getFirefoxpath()
	{
	String Firefoxpath=pro.getProperty("Firefoxpath");
	return Firefoxpath;
	}
	public String getedgepath()
	{
	String edgepath=pro.getProperty("edgepath");
	return edgepath;
	}
}

