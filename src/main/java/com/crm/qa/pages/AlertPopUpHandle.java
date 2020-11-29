package com.crm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\ChromeDriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Test Case passed and Displays correct Alert Message");
		}
		
		else
		{
			System.out.println("Displays incorrect alert message");
		}
		
		alert.accept();
		
		driver.close();
		
	}

}
