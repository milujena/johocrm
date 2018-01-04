package com.kritpost.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.kritpost.pages.Login_Page;

public class BaseTest implements AutoConst
{
public static WebDriver driver;
	
	@BeforeClass
	public void preCondition()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://192.168.188.130:8080/crm/HomePage.do");
	}
	
	@AfterClass
	public void postConditions()
	{
		driver.close();	
	}
	@BeforeMethod
	public void loginTest()
	{
		
		Login_Page ln = new Login_Page(driver);
		ln.login_Field(USERNAME);
		ln.passWord_Field(PASSWORD);
		ln.signUp();
	}
	
	@AfterMethod()
	public void logoutTest()
	{
		Login_Page ln=new Login_Page(driver);
		ln.signOut();
	}
	
	
}
