package com.diegotomfurtado.webdriverpageobject.pages;

import static org.openqa.selenium.By.xpath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePages {

	private final By validateUsersCredentials = xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
	private final By invalidEmailsCredentials = xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
	private final By checkErroMessageAuthentication = xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
	private final By validateAuthenticationUsersCredentials = xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
	private final By authenticationUsersCredentials = xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");

	public MyAccountPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public String shouldLoginWithSuccess() {
		return browser.findElement(validateUsersCredentials).getText();
	}

	public String shouldNotLoginWithWrongEmailsCredentials() {
		return browser.findElement(invalidEmailsCredentials).getText();
	}

	public String shouldNotLoginWithWrongPasswordCredentials() {
		return browser.findElement(checkErroMessageAuthentication).getText();
	}

	public String shouldAuthenticateUsersCredentials() {
		return browser.findElement(validateAuthenticationUsersCredentials)
				.getText();
	}

	public void validateAuthenticationUsersCredentials() {
		String userName = browser.findElement(authenticationUsersCredentials)
				.getText();
		Assert.assertEquals("Diego Santos", userName);
	}
}
