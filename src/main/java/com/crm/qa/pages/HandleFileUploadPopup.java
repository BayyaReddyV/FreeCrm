package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\ChromeDriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\91961\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");

	
	}

}
