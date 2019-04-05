package com.windowhandling.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	
	static WebDriver w1;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		w1 = new ChromeDriver();
		
		
		String baseUrl = "https://www.naukri.com";
		
		w1.get(baseUrl);
		
		
		switchToWindow(2);
		
		switchToWindow(3);
		
		switchToWindow(4);
		
		switchToWindow(5);
		
		w1.switchTo().defaultContent();
		
	}
	
	
	public static void switchToWindow(int index) {
		
		String windowId = "";
		
		Set<String> winHdl = w1.getWindowHandles();
		
		
		Iterator<String> itr = winHdl.iterator();
		
		for (int i=0;i<index;i++){
			
			windowId = itr.next();

		}
		
	  System.out.println(windowId);
		
	  w1.switchTo().window(windowId);
	
	}
}
	

