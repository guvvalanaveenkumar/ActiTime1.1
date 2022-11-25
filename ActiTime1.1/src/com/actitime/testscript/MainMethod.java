package com.actitime.testscript;
import org.openqa.selenium.WebDriver;
import qsp.chromedriver;
public class MainMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new chromedriver();
		driver.get("http://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin","manager");	
	}
}
