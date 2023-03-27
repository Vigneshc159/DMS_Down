package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRepo {
	public @FindBy(id="email") WebElement username;
	public @FindBy(id="password") WebElement password;
	public @FindBy(xpath="//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained jss5 MuiButton-containedPrimary MuiButton-fullWidth\"]") WebElement signin;
	public @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/header/div/div[3]/a[3]/button") WebElement pro;
	public @FindBy(xpath="//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd\"]") WebElement input;
	public @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/ul/li/div/div/div/div/div/div[1]/div[1]/table/tfoot/tr/td/div[2]/button[1]") WebElement download;
	public @FindBy(xpath="/html/body/div[3]/div[3]/div/div[3]/button[2]") WebElement yes;

	
}
