package com.mobiletest.dsdet.tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.mobiletest.sdet.pages.HomePage;

import Mobile.SDETMobile_Testing.BaseClass;

public class TC_HomePage extends BaseClass {

	@Test
	public void HomePage() throws InterruptedException, MalformedURLException {
		HomePage home = new HomePage(driver);
		home.ClickMenu();
		Thread.sleep(3000);
		home.WriteSomething("Hi,How are you?");
		home.ClickSave();
		
		

	}

}
