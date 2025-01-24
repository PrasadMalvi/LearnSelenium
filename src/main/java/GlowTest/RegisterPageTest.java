package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil =  new BrowserUtil();
		WebDriver driver = brUtil.initDriver("Chrome");
		
		brUtil.launchURL("http://localhost:3000/login");
		
		//driver.findElement(By.xpath("//span[@class='signup-link']")).click();
		driver.findElement(By.className("signup-link")).click();
		
		By userName = By.name("username");
		By emailId = By.name("email");
		By password = By.name("password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(userName, "Prasad");
		elUtil.doSendKeys(emailId, "SelTest@gmail.com");
		elUtil.doSendKeys(password, "Seltest@123");
		
		Thread.sleep(2000);
		brUtil.quitBrowser();
		

	}

}
