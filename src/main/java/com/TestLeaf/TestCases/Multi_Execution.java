package com.TestLeaf.TestCases;

import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class Multi_Execution extends ProjectSpecificMethods {
	
	@Test
	public void runCreateLead()
	{
		new LoginPage(driver)
		.enterUsername("DemoCSR2")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead();

}
}
