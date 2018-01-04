package com.kritpost.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.kritpost.generic.BaseTest;
import com.kritpost.generic.ExcelData;
import com.kritpost.pages.Campaigns_page;
import com.kritpost.pages.CreateCampaign_page;

@Listeners(com.kritpost.generic.ListenerTest.class)
public class OwnerCreatingCampaign_Test extends BaseTest 
{
  @Test
  public void creatingCampaign()
  {
	  
	  String campaignName=ExcelData.getData(PATH, SHEET, 1, 1);
	  String startDate=ExcelData.getData(PATH, SHEET, 2, 1);
	  String endDate=ExcelData.getData(PATH, SHEET, 3, 1);
	  String expected_rev=ExcelData.getData(PATH, SHEET, 4, 1);
	  Campaigns_page campaigns_page=new Campaigns_page(driver);
	  campaigns_page.campaignModule();
	  campaigns_page.newCampaignBtn();
	  CreateCampaign_page createCampaign_page=new CreateCampaign_page(driver);
	  createCampaign_page.campaignName(campaignName);
	  createCampaign_page.startDate(startDate);
	  createCampaign_page.endDate(endDate);
	  createCampaign_page.expectedRevenue(expected_rev);
	  createCampaign_page.saveBtn();
	  
	  
  }
}
