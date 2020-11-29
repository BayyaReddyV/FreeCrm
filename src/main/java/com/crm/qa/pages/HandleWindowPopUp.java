package com.crm.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\Career\\Selenium Webdriver\\ChromeDriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[@class='blu']")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
	    Iterator<String> itr =	handle.iterator();
	
	    String parentWindowId = itr.next();
	    System.out.println("parent window id is:" + parentWindowId);
	    
	    String childWindowId = itr.next();
	    System.out.println("Child window id is: " + childWindowId);
	    
	    driver.switchTo().window(childWindowId);
	    String childTitle = driver.getTitle();
	    System.out.println("Child  Title is:" + childTitle);
	    driver.close();
	    
	    driver.switchTo().window(parentWindowId);
	    String parentTitle = driver.getTitle();
	    System.out.println("Parent Title is:" + parentTitle);
	    		
	    driver.close();
	}

}
