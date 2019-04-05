package com.ScrollBy.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollByJS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C://geckodriver.exe");
		
		WebDriver w1 = new FirefoxDriver();
		
		
		JavascriptExecutor js = (JavascriptExecutor) w1;
		
		w1.get("https://www.amazon.in/");
		
		w1.manage().window().maximize();
		
		js.executeScript("window.scrollBy(0,900)");
		
		js.executeScript("window.scrollBy(0,0)");
		
		js.executeScript("window.scrollBy(0,1200)");
		
		
	}

}
