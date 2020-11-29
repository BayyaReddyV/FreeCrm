package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(className ="icon icon-xs mdi-chart-bar")
	WebElement loginBtn;

	
	@FindBy(className="ui fluid large blue submit button")
	WebElement InsideLoginBtn;
	
	@FindBy(xpath="//a[contains(@text(), 'Sign Up')]")
	WebElement signUpLink;
	
	@FindBy(xpath="//a[contains(@class, 'brand-name')]")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
			}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean  validateCRMLogo() {
		return crmLogo.isDisplayed();
	}
		
	public Homepage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		InsideLoginBtn.click();
		
		return new Homepage();
		
	}
}