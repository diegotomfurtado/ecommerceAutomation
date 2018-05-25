package setUp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpBrowser {
	
	public static WebDriver setUpBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Drivers\\DrivesAutomations\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		browser.get("http://automationpractice.com/index.php");
		return browser;
	}
}
