package com.kritpost.generic;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils extends BasePage
{
	public GenericUtils(WebDriver driver) 
	{
		super(driver);
		
	}

	public static void selectByIndex(WebElement element, int n)
	{
		Select sel = new Select(element);
		sel.selectByIndex(n);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);;
	}
	
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	
	public static void aceptAlert()
	{
	  Alert alt=BaseTest.driver.switchTo().alert();
	  alt.accept();
	}
}
