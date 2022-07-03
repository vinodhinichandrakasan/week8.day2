package com.TestLeaf.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.TestLeaf.Utils.ExcelRead;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public static Properties prop1;
	
public  WebDriver driver;

public String fileName;
  //public Properties;

	@Parameters("browser")
	@BeforeMethod
	public void pre_condition(@Optional("chrome")String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 }
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(new File("C:\\TestLeaf\\LeafTapsMultiLingual\\src\\main\\resources\\config.properties"));
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		String lang=prop.getProperty("lang");
		prop1=new Properties();
		FileInputStream fis2=new FileInputStream(new File("C:\\TestLeaf\\LeafTapsMultiLingual\\src\\main\\resources\\"+lang+".properties"));
		prop1.load(fis2);
		 //driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void post_condition()
	{
		driver.close();
	}
	
	



}
