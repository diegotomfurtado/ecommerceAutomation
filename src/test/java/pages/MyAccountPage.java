package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePages{

	public MyAccountPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public String ct_001_ValidateUsersCredentials() {
		return browser.findElement(By
				.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
	}

	public MyAccountPage ct_002_InvalidEmailsCredentials(String user) {
		WebElement validUserLogged = browser.findElement(By
				.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));

		assertEquals(user, validUserLogged.getText());
		return this;
	}

	public MyAccountPage ct_003_InvalidPasswordsCredentials(String user) {
		WebElement validUserLogged = browser.findElement(By
				.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));

		assertEquals(user, validUserLogged.getText());
		return this;
	}

	public MyAccountPage ct_004_ValidateAuthenticationUsersCredentials(
			String user) {
		WebElement validUserLogged = browser.findElement(By
				.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));

		assertEquals(user, validUserLogged.getText());
		return this;
	}
}
