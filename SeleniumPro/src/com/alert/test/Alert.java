package com.alert.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.firefox.marionette", "c://geckodriver.exe");
		
		WebDriver w1 = new FirefoxDriver();
		
		w1.get("http://demo.guru99.com/test/delete_customer.php");
		
		w1.manage().window().maximize();
		
		WebElement usrname = w1.findElement(By.name("cusid"));
		
		usrname.sendKeys("23456");
		
		WebElement submit_btn = w1.findElement(By.name("submit"));
		
		submit_btn.click();
		
		w1.switchTo().alert().accept();
		
		w1.switchTo().alert().accept();
		
		
		

	}

}
