package com.kritpost.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignName_Page extends BasePage 
{
	@FindBy(name="property(Campaign Name)")
	private WebElement campName;

	public CampaignName_Page(WebDriver driver)
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void campainNameField(WebDriver drver)
	{
		
	}

}
