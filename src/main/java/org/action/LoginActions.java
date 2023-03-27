package org.action;

import org.openqa.selenium.Keys;
import org.repo.LoginRepo;

public class LoginActions extends LoginRepo {
	public void login(String Username, String Password,String Filter) throws InterruptedException {
		username.sendKeys(Username);
		password.sendKeys(Password);
		signin.click();
//		pro.click();
	//	Thread.sleep(10000);
	//	input.clear();
		//Thread.sleep(10000);
	//	input.sendKeys(Filter);
	//	input.sendKeys(Keys.ENTER);
	//	download.click();
	//	yes.click();
	//	Thread.sleep(50000);
		
	}

}
