package org.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

import java.util.HashMap;

import org.action.LoginActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends PropertyFileReader{
	protected static WebDriver wb;
	protected LoginActions loginaction;//2	
	protected PropertyFileReader Propertyfilereader;//3

	
	@BeforeMethod
	public void launch() throws IOException {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\DMS\\");
		//prefs.put("downloads.default_directory",System.getProperty("user.dir")+"downloads");
		options.setExperimentalOption("prefs", prefs);
		wb=new ChromeDriver(options );
		
		
		wb.get("https://app.designsolar.io/proposals?createdFrom=2020-07-31");
		//wb.get("http://54.176.3.36/MX145/Views/CreateProposal.aspx?TransId=2542");
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		loginaction = PageFactory.initElements(wb, LoginActions.class);
		Propertyfilereader=PageFactory.initElements(wb, PropertyFileReader.class);

	}

	

//	@AfterMethod
//	public void close() {
//		wb.quit();
//	}
	



}
