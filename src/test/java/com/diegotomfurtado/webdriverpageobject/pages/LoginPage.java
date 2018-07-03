package com.diegotomfurtado.webdriverpageobject.pages;

import static org.openqa.selenium.By.linkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePages{

	public LoginPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public LoginInFormPage clickSignIn() {
		browser.findElement(linkText("Sign in")).click();
		return new LoginInFormPage(browser);
	}
}
