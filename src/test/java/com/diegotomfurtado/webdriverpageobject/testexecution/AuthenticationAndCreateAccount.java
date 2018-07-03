package com.diegotomfurtado.webdriverpageobject.testexecution;

import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.diegotomfurtado.webdriverpageobject.pages.LoginPage;
import com.diegotomfurtado.webdriverpageobject.setup.SetUpBrowser;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "validateUsersCredentials.csv")
public class AuthenticationAndCreateAccount {

	private WebDriver browser;

	@Before
	public void setUpOpenBrowser() {
		browser = SetUpBrowser.setUpBrowser();
	}

	@Test
	public void shouldLoginWithSuccess(
			@Param(name = "email") String login,
			@Param(name = "passwd") String password, 
			@Param(name = "user") String user) {

		String returnUserCredential = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.shouldLoginWithSuccess();
		assertEquals(user,returnUserCredential);
		browser.quit();
	}

	@Test
	public void ShouldNotLoginWithWrongEmailsCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		String returnUserCredential = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ShouldNotLoginWithWrongEmailsCredentials();
		assertEquals(user, returnUserCredential);
		
		browser.quit();
	}
	
	@Test
	public void ShouldNotLoginWithWrongPasswordCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		String returnUserCredential = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ShouldNotLoginWithWrongPasswordCredentials();
		assertEquals(user, returnUserCredential);
		
		browser.quit();
	}
	
	@Test
	public void shouldAuthenticateUsersCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		String returnUserCredential = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.shouldAuthenticateUsersCredentials();
		assertEquals(user, returnUserCredential);
		
		browser.quit();
	}
	
}