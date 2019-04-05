package com.DownloadFile.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
*/
public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "c://geckodriver.exe");
		
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("browser.download.dir","D://testcheck");
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.ms-excel");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);
		
		FirefoxOptions options = new FirefoxOptions();
		
		options.setProfile(profile);
		
	    WebDriver w1 = new FirefoxDriver(options);
	    
	    w1.manage().window().maximize();
	    
	    
	    
	    
	    w1.get("http://file-examples.com/index.php/sample-documents-download/"); 
	    	    
	    
	    Thread.sleep(5000);
	  /* WebDriverWait myWaitVar = new WebDriverWait(w1,10);
	   myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='text-right file-link']//a")));*/

	   List<WebElement> link =  w1.findElements(By.xpath("//*[@class='text-right file-link']//a"));
	   
	  link.get(0).click();
	    
	

	}

}
