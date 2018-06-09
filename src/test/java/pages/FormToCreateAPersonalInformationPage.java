package pages;

import static org.openqa.selenium.By.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormToCreateAPersonalInformationPage extends BasePages {

	public FormToCreateAPersonalInformationPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	By accountCreationFormLocator = id("account-creation_form");

	public FormToCreateAPersonalInformationPage chooseTitleMrsOrMrs() {
		browser.findElement(id("account-creation_form"))
				.findElement(id("id_gender1")).click();
		return this;
	}

	public FormToCreateAPersonalInformationPage typeCustomerFirstName(
			String customer_firstname) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id(customer_firstname))
				.sendKeys(customer_firstname);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeCustomerLastName(
			String customer_lastname) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("customer_lastname"))
				.sendKeys(customer_lastname);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeNewPassword(String passwd) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("passwd"))
				.sendKeys(passwd);
		return this;
	}

	public FormToCreateAPersonalInformationPage chooseStaticDay() {
		WebElement campoTypeDays = browser.findElement(id("days"));
		new Select(campoTypeDays).selectByVisibleText("8  ");
		return this;
	}

	public FormToCreateAPersonalInformationPage chooseStaticMonth() {
		WebElement campoTypeDays = browser.findElement(id("months"));
		new Select(campoTypeDays).selectByVisibleText("April ");
		return this;
	}

	public FormToCreateAPersonalInformationPage chooseStaticYear() {
		WebElement campoTypeDays = browser.findElement(id("years"));
		new Select(campoTypeDays).selectByVisibleText("1987  ");
		return this;
	}

	public FormToCreateAPersonalInformationPage typeFirstNameToAdress(
			String firstname) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("firstname")).sendKeys(firstname);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeLastNameToAdress(
			String lastname) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("lastname")).sendKeys(lastname);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeCompanyName(String company) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("company")).sendKeys(company);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeAdressNumberOne(
			String address1) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("address1")).sendKeys(address1);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeAdressNumberTwo(
			String address2) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("address2")).sendKeys(address2);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeCityName(String city) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("city")).sendKeys(city);
		return this;
	}

	public FormToCreateAPersonalInformationPage typePostCode(String postcode) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("postcode")).sendKeys(postcode);
		return this;
	}

	public FormToCreateAPersonalInformationPage chooseStaticStateName() {
		WebElement campoTypeDays = browser.findElement(id("id_state"));
		new Select(campoTypeDays).selectByVisibleText("Alaska");
		return this;
	}

	public FormToCreateAPersonalInformationPage typePhoneMobileNumber(
			String phone_mobile) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("phone_mobile")).sendKeys(phone_mobile);
		return this;
	}

	public FormToCreateAPersonalInformationPage typeAlias(String alias) {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("alias")).sendKeys(alias);
		return this;
	}

	public FormToCreateAPersonalInformationPage clickToCreateNewAccount() {
		browser.findElement(accountCreationFormLocator)
				.findElement(id("submitAccount")).click();
		return this;
	}
}
