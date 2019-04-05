package com.windowdimension.test;



/*import org.openqa.selenium.Dimension;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dimensions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	/*	
		Dimension d = new Dimension(400,400);
		
		WebDriver w1 = new ChromeDriver();
		
		
		w1.manage().window().maximize();
		
		w1.get("https://google.com");
		
		w1.manage().window().setSize(d);*/
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--window-size=100,1000");
		
	    WebDriver w1 = new ChromeDriver(options);

	    w1.get("https://google.com");
	}

}
