package com.kritpost.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.kritpost.generic.BaseTest;
import com.kritpost.generic.ExcelData;
import com.kritpost.pages.Campaigns_page;
import com.kritpost.pages.CreateCampaign_page;
@Listeners(com.kritpost.generic.ListenerTest.class)
public class OwnerEditingCampaign_Test extends BaseTest
{
	@Test
	public void edit()
	{
		String rName=ExcelData.getData(PATH, SHEET, 1, 2);
		String typeDwn=ExcelData.getData(PATH, SHEET, 5, 1);
		String statusDwn=ExcelData.getData(PATH, SHEET, 6, 1);
		Campaigns_page cp=new Campaigns_page(driver);
		cp.campaignModule();
		cp.miluRoadBtn();
		cp.editBtn();
		CreateCampaign_page ccp=new CreateCampaign_page(driver);
		ccp.campainFieldClear();
		ccp.campaignName(rName);
		ccp.typeDropDown(typeDwn);
		ccp.StatusDwn(statusDwn);
		ccp.saveBtn();
		
		
	}

}
