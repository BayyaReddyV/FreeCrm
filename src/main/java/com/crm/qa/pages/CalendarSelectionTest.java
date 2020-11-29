package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectionTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\ChromeDriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.freecrm.com/calendar");
		
		driver.findElement(By.name("email")).sendKeys("vbreddy1234@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Icloud#12321");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		

		String date = "20-November-2020";
		
		String dateArr[] =date.split("-");                //{20, November,2o2o}
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[5]/div[2]/div/div[5]
		

		
		
		
	}

}
