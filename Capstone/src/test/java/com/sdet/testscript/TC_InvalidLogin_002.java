package com.sdet.testscript;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class TC_InvalidLogin_002 extends SauceDemo {
	
	@Test(priority=2)
	public void testValidLogin() throws IOException {
		
		loginPage.getUserName().sendKeys(prop.getProperty("Username2"));
		loginPage.getPassword().sendKeys(prop.getProperty("Password2"));
		loginPage.getLoginButton().click();

		String title = driver.getCurrentUrl();
        System.out.println(title);

		if(title.contains("https://www.saucedemo.com/inventory.html")) {
		Assert.assertTrue(title.contains("https://www.saucedemo.com/inventory.html"));
		System.out.println("Successfully Login to HomePage");
		}else {
		captureScreenShot(driver, "invalidloginfailed");
		System.out.println("Not Successfully Login to HomePage");
		Assert.assertTrue(title.contains("https://www.saucedemo.com/"));
		}
		
	}


}
