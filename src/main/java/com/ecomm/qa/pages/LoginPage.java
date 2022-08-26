package com.ecomm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//OR Object Repository
	
	@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
	WebElement loginButton;

	//@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
	//WebElement username;
	
	@FindBy(xpath="//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement passwor;
	
	@FindBy(xpath="//span[@class=\'ng-star-inserted\']")
	WebElement loginbutton;
	@FindBy(xpath="//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
	WebElement usernam;
	
	@FindBy(xpath="//button[@text='logo']")
	WebElement logo;
	
	//How to initialize page factory

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions , features
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public void login(String un, String pwd) {
		loginButton.click();
	//	username.click();
		passwor.click();
		usernam.sendKeys();
		
		//password.sendKeys(pwd);
		loginbutton.click();
	}

}
