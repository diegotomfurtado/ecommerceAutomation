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

		String validUserLogged = new LoginPage(browser)
			.clickSignIn()
			.typeLogin(login)
			.typePassword(password)
			.clickSubmitLogin()
			.ct_001_ValidateUsersCredentials();
		assertEquals(user,validUserLogged);
		browser.quit();
	}

	@Test
	public void ct_002_InvalidEmailsCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		new LoginPage(browser)
		.clickSignIn()
		.typeLogin(login)
		.typePassword(password)
		.clickSubmitLogin()
		.ct_002_InvalidEmailsCredentials(user);
		
		browser.quit();
	}
	
	@Test
	public void ct_003_InvalidPasswordsCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		new LoginPage(browser)
		.clickSignIn()
		.typeLogin(login)
		.typePassword(password)
		.clickSubmitLogin()
		.ct_003_InvalidPasswordsCredentials(user);
		
		browser.quit();
	}
	
	@Test
	public void ct_004_ValidateAuthenticationUsersCredentials(
			@Param (name = "email") String login,
			@Param (name = "passwd")String password,
			@Param (name = "user") String user){
		
		new LoginPage(browser)
		.clickSignIn()
		.typeLogin(login)
		.typePassword(password)
		.clickSubmitLogin()
		.ct_004_ValidateAuthenticationUsersCredentials(user);
		
		browser.quit();
	}
	
}