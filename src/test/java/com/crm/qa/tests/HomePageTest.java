package com.crm.qa.tests;

import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
 
	LoginPage loginpage;
	
	HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
}
