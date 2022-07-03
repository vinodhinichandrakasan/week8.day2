package com.TestLeaf.Pages;

import org.apache.poi.poifs.property.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class LeadPage extends ProjectSpecificMethods{
	
	public LeadPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLeadPage clickCreateLead()
	{
		
		driver.findElement(By.linkText(prop1.getProperty("link_Create_Lead"))).click();
		return new CreateLeadPage(driver);
	}
	
    public FindLead editLeadOption()
    {
		
         driver.findElement(By.linkText("Find Leads")).click();		 
		//driver.findElement(By.xpath("//form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Vino");
		return new FindLead(driver);
		
	}

}
