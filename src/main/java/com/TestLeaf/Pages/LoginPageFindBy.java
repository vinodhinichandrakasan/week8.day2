package com.TestLeaf.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class LoginPageFindBy extends ProjectSpecificMethods{
	
	public LoginPageFindBy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="username")WebElement eleuserName;
	public LoginPageFindBy enterUsername(String username)
	{
		
		eleuserName.sendKeys(username);
		return this;
	}
	@FindBy(how=How.ID,using="password")WebElement elePassword;
	public LoginPageFindBy enterPassword(String pwd)
	{
		elePassword.sendKeys(pwd);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")WebElement eleClick;
	public Homepage clickLogin()
	{
		
		eleClick.click();
		return new Homepage(driver);
	}
	
	

}
