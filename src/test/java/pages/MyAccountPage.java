package pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePages {

	public MyAccountPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public String ct_001_ValidateUsersCredentials() {
		return browser
				.findElement(
						xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"))
				.getText();
	}

	public String ct_002_InvalidEmailsCredentials() {
		return browser.findElement(
				xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}

	public String ct_003_InvalidPasswordsCredentials() {
		return browser.findElement(
				xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}

	public String ct_004_ValidateAuthenticationUsersCredentials() {
		return browser.findElement(
				xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}
}
