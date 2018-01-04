package com.kritpost.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.kritpost.generic.BaseTest;
import com.kritpost.generic.GenericUtils;
import com.kritpost.pages.Campaigns_page;
import com.kritpost.pages.CreateCampaign_page;
@Listeners(com.kritpost.generic.ListenerTest.class)
public class OwnerDeleteCampaign_Test extends BaseTest
{

	@Test
	public void ownerDeletingCampaign() throws InterruptedException
	{
		Campaigns_page cp=new Campaigns_page(driver);
		cp.campaignModule();
		cp.milu123();
		CreateCampaign_page ccp=new CreateCampaign_page(driver);
		ccp.deleteBtn();
		Thread.sleep(3000);
		GenericUtils.aceptAlert();
		
		
	}
}
