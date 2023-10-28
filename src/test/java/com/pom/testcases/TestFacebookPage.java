package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.pages.FacebookHomePage;

public class TestFacebookPage {
	@Test
	public void testFacebookHomePage() {
		FacebookHomePage obj = new FacebookHomePage();
		obj.TestBase();
		obj.enterEmail();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.enterPassword();
		obj.clickSignIn();
		System.out.println("Facebok Login Should be Unsuccessful!");
		obj.closeBrowser();
	}
	
}
