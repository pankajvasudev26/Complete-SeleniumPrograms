package com.takescreenshot.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScrnshot {
	
	
	
	@Test
	public void takePicture() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		
		String baseUrl = "https://google.com";
		
		w1.get(baseUrl);
		
		
		this.takeSnapshoty(w1, "D://test.png");
		
		w1.get("https://yahoo.com");
		
		this.takeSnapshoty(w1, "D://test.png");
		
	}
	
	public void takeSnapshoty(WebDriver w1, String filepath) throws IOException {
		
		
		TakesScreenshot srnShot = ((TakesScreenshot) w1);
		
		File srcFile = srnShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File(filepath);
		
		FileUtils.copyFile(srcFile, DestFile);
	
		
	}
	
	
	
	

}


