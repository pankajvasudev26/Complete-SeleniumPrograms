package com.BrokenLinks.test;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BrokenLinksOnPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "c://geckodriver");
		
		WebDriver w1 = new FirefoxDriver();
		
		w1.manage().window().maximize();
		
		String baseUrl = "https://www.google.co.in";
		
		w1.get(baseUrl);
		
		String urltext;
		
		int respCode;
		
		List<WebElement> links = w1.findElements(By.tagName("a"));
		
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext()) {
			
			urltext = it.next().getAttribute("href");
			
			
			/*System.out.println(urltext);*/
			
			if((urltext == null) || urltext.isEmpty()) {
				
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
				
			}
	
			if(!urltext.startsWith(baseUrl)) {
				
				System.out.println("URL belongs to other domain, skipping it");
				continue;
			}
			
			try {
				
				URL url = new URL(urltext);
				
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				respCode = huc.getResponseCode();
				
				if(respCode >= 400) {
					
					System.out.println(urltext + "link is broken");
				}
				else {
					System.out.println(urltext + "link is fine");
				}
				
			}		
			catch(MalformedURLException e){
				
				e.printStackTrace();
				
			}
			catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
			
			
			
		}
		
		
		
		
		
		

	}

}
