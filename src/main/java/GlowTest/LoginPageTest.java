package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchURL("http://localhost:3000/login");
		
		System.out.println(brUtil.getPageTitle());
		
		By emailId = By.name("email");
		By password = By.name("password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(emailId, "user@test.com");
		elUtil.doSendKeys(password, "Testuser@123");
		
		brUtil.quitBrowser();
	}

}
