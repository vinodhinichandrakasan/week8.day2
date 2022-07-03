package com.TestLeaf.TestCases;

import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;

import com.TestLeaf.Pages.LoginPageFindBy;

public class Login_FindBy extends ProjectSpecificMethods {
	
	@Test
	public void runCreateLead()
	{
		new LoginPageFindBy(driver)
		.enterUsername("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCRMSFA();
		

}
}
