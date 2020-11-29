package com.crm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {

	   @Test
		public void verifyTitle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
