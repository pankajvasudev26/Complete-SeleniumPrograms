package com.textwithoutsendkeys.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		
		WebDriver w1 = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) w1;
		
		w1.get("https://google.com");
		
		js.executeScript("arguments[0].value='Spainish Cream';", w1.findElement(By.name("q")));
		js.executeScript("arguments[1].click();", w1.findElement(By.name("btnK")));
				    
		                      
		
		
		

	}

}
