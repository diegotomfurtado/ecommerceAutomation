package br.com.diegotomfurtado.webdriverJava.pageObject;

import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import setUp.SetUpBrowser;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "validateUsersCredentials.csv")
public class AuthenticationAndCreateAccount {

	private WebDriver browser;

	@Before
	public void setUpOpenBrowser() {
		browser = SetUpBrowser.setUpBrowser();
	}

	@Test
	public void ct_001_ValidateUsersCredentials(
			@Param(name = "email") String login,
			@Param(name = "passwd") String password, 
			@Param(name = "user") String user) {

		String ValidateUsersCredentials = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ct_001_ValidateUsersCredentials();
		assertEquals(user,ValidateUsersCredentials);
		browser.quit();
	}

	@Test
	public void ct_002_InvalidEmailsCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		String InvalidEmailsCredentials = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ct_002_InvalidEmailsCredentials();
		assertEquals(user, InvalidEmailsCredentials);
		
		browser.quit();
	}
	
	@Test
	public void ct_003_InvalidPasswordsCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		String InvalidPasswordsCredentials = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ct_003_InvalidPasswordsCredentials();
		assertEquals(user, InvalidPasswordsCredentials);
		
		browser.quit();
	}
	
	@Test
	public void ct_004_ValidateAuthenticationUsersCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		String ValidateAuthenticationUsersCredentials = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ct_004_ValidateAuthenticationUsersCredentials();
		assertEquals(user, ValidateAuthenticationUsersCredentials);
		
		browser.quit();
	}
	
}