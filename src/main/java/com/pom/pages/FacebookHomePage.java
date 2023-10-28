package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class FacebookHomePage extends TestBase {
	public void enterEmail() {
		driver.findElement(By.id("email")).sendKeys("email123456");
	}
	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("123456");
	}
	public void clickSignIn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
