package com.uploadfile.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver w1 = new ChromeDriver();
		
		w1.manage().window().maximize();
		
		w1.get("http://www.tinyupload.com/");
		
		w1.findElement(By.xpath("//*[@name = 'uploaded_file']")).sendKeys("D:\\excel file\\excelFile.ods");
		
		w1.findElement(By.xpath("//*[@src = 'images/button_upload.gif']")).click();
		

	}

}
