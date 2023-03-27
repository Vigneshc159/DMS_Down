package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class Entry extends Base{ 

	@Test(priority=1, description="Report ")
	public void TC1() throws IOException, InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String filter=PropertyFileReader.propertymap.get("Filter");

		loginaction.login(LoginID, Password,filter);
	}
	
}


