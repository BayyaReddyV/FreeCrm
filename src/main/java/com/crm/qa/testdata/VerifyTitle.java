package com.crm.qa.testdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
	public  void VerifyPageTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.co.in/");
		String title= driver.getTitle();
		System.out.println(title);
		
	}

}
