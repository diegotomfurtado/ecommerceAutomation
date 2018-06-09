package pages;

import static org.openqa.selenium.By.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInFormPage extends BasePages{

	public LoginInFormPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public LoginInFormPage typeLogin(String login) {
		browser.findElement(id("login_form")).findElement(By.id("email"))
				.sendKeys(login);
		return this;
	}

	public LoginInFormPage typePassword(String password) {
		browser.findElement(id("login_form")).findElement(By.id("passwd"))
				.sendKeys(password);
		return this;
	}

	public LoginInFormPage typeNewEmail(String email_create) {
		browser.findElement(id("create-account_form"))
				.findElement(id("email_create")).sendKeys(email_create);
		return this;
	}

	public MyAccountPage clickSubmitLogin() {
		browser.findElement(id("SubmitLogin")).click();
		return new MyAccountPage(browser);
	}

	public FormToCreateAPersonalInformationPage clickSubmitCreateNewAccont() {
		browser.findElement(id("SubmitCreate")).click();
		return new FormToCreateAPersonalInformationPage(browser);
	}
}
