package com.kritpost.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kritpost.generic.BasePage;
import com.kritpost.generic.GenericUtils;

public class CreateCampaign_page extends BasePage
{
	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement campaignName;
	
    @FindBy(name="property(Start Date)")
    private WebElement startDate;
    
    @FindBy(name="property(Expected Revenue)")
    private WebElement expectRevenue;
    
    @FindBy(name="property(End Date)")
    private WebElement enddate;
    
    @FindBy(xpath="//input[@name='Button'and @type='submit']")
    private WebElement save;
    
   @FindBy(xpath="//select[@name='property(Type)']")
   private WebElement typeDrop;
   
   @FindBy(xpath="//select[@name='property(Status)']")
   private WebElement status;
   
   @FindBy(xpath="//input[@value='Delete']")
   private WebElement deleteBtn;
   public void deleteBtn()
   {
	   deleteBtn.click();
   }
   
   public void StatusDwn(String st)
   {
	   GenericUtils.selectByVisibleText(status, st);
   }
   
   public void typeDropDown(String type)
   {
	   GenericUtils.selectByVisibleText(typeDrop, type);
   }    
    
    
	public CreateCampaign_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void campaignName(String name)
	{
		campaignName.sendKeys(name);
	}
	public void campainFieldClear()
	{
		campaignName.clear();
	}
	
	public void startDate(String data)
	{
		startDate.sendKeys(data);
	}
	
	public void expectedRevenue(String rs)
	{
		expectRevenue.sendKeys(rs);
	}
	
	public void endDate(String date)
    {
    	enddate.sendKeys(date);
    }
    
	 public void saveBtn()

	 {
	    	save.click();
	  }
}
