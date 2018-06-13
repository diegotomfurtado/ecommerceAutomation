package br.com.diegotomfurtado.webdriverJava.pageObject;

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
@DataLoader(filePaths = "UsersAccountCreation.csv")
public class UsersAccountCreation {
	
	private WebDriver browser;
	
	@Before
	public void setUpOpenBrowser() {
		browser = SetUpBrowser.setUpBrowser();
	}
	
	@Test
	public void createUserAccount(
			@Param(name = "email_create") String email_create,
			@Param(name = "customer_firstname") String customer_firstname,
			@Param(name = "customer_lastname") String customer_lastname,
			@Param(name = "passwd") String passwd,
			@Param(name = "firstname") String firstname,
			@Param(name = "lastname") String lastname,
			@Param(name = "company") String company,
			@Param(name = "address1") String address1,
			@Param(name = "address2") String address2,
			@Param(name = "city") String city,
			@Param(name = "postcode") String postcode,
			@Param(name = "phone_mobile") String phone_mobile,
			@Param(name = "alias") String alias) {

		new LoginPage(browser)
		.clickSignIn()
		.typeNewEmail(email_create)
		.clickSubmitCreateNewAccont()
		.chooseTitleMrsOrMrs()
		.typeCustomerFirstName(customer_firstname)
		.typeCustomerLastName(customer_lastname)
		.typeNewPassword(passwd)
		.chooseStaticDay()
		.chooseStaticMonth()
		.chooseStaticYear()
		.typeFirstNameToAdress(firstname)
		.typeLastNameToAdress(lastname)
		.typeCompanyName(company)
		.typeAdressNumberOne(address1)
		.typeAdressNumberTwo(address2)
		.typeCityName(city)
		.typePostCode(postcode)
		.chooseStaticStateName()
		.typePhoneMobileNumber(phone_mobile)
		.typeAlias(alias)
		.clickToCreateNewAccount()
		.validateAuthenticationUsersCredentials();
	}
}
