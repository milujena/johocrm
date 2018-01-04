package com.kritpost.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kritpost.generic.BasePage;

public class Campaigns_page extends BasePage
{
	@FindBy(xpath="//a[.='Campaigns']")
	private WebElement campaignsModule;
	
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newCampain;
	
	@FindBy(xpath="//a[.='MiluRoad']")
	private WebElement milu;
	@FindBy(xpath="//a[.='Milu123']")
	private WebElement milua123;
	
	public void milu123()
	{
		milua123.click();
	}
	
	@FindBy(xpath="//input[@value='Edit']")
	private WebElement edit;
	
	public Campaigns_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void campaignModule()
	{
		campaignsModule .click();
	}
	public void newCampaignBtn()
	{
		newCampain.click();
	}

	public void miluRoadBtn()
	{
		milu.click();
	}
	public void editBtn()
	{
		edit.click();
	}

}
