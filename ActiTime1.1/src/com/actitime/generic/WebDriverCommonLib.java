package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
/**
 * implict wait for page load in gui
 * 
 */
public void waitForPageLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
/**
 *Explicit wait for element present in gui
 * @param driver
 * @param element
 */
public void waitForelement(WebDriver driver,WebElement element) {
WebDriverWait wait=new WebDriverWait(driver,10);
	

	
}
		
		
		
		
		
		
		
	}
