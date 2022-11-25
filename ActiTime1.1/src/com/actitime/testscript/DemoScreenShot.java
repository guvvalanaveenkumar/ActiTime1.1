package com.actitime.testscript;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import qsp.chromedriver;
public class DemoScreenShot {
static { 
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String []args)throws IOException {
	WebDriver driver=new chromedriver();
	driver.get("https://www.amazon.com/");
	TakesScreenshot t=(TakesScreenshot)driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ScreenShot/ss.png");
	FileUtils.copyFile(src, dest);
	driver.close();
	
	
	
	
	
	
	/*driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox'] ")).sendKeys("watches");
	driver.findElement(By.id("nav-search-submit-button")).click();
	//WebElement tgt_element = driver.findElement(By.xpath(".//img[contains(@src,'https://m.media-amazon.com/images/I/51L9JfGg6eL._AC_UL320_.jpg')]"));
	WebElement tgt_element = driver.findElement(By.xpath(".//img[contains(@alt,'Sponsored Ad - Mens Watches BY BENYAR Chronograph Analog Quartz Movement ')]"));
	
	File file=tgt_element.getScreenshotAs(OutputType.FILE);
	
	File dest1=new File("./ScreenShot/ss.png");
	FileUtils.copyDirectory(file, dest1);
	driver.close();*/
}
}