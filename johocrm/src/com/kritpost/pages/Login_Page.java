package com.kritpost.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kritpost.generic.BasePage;

public class Login_Page extends BasePage
{
	@FindBy(id="userName")
	private WebElement login;
	@FindBy(id="passWord")
	private WebElement password;
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signup;
	
	@FindBy(xpath="//a[contains(.,'Logout [rashmi@dell.com]')]")
	private WebElement signout;


	public Login_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void login_Field(String u_name)
	{
		login.sendKeys(u_name);
	}
	
	public void passWord_Field(String u_psw)
	{
		password.sendKeys(u_psw);
	}
	
	public void signUp()
	{
	    signup.click();
	}
	
	public void signOut()
	{
		signout.click();
	}
	
}
