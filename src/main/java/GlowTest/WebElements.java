package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/login");
		//Create a webelement + perform Ation(click, sendkeys, getText, isDisplayed)
		//1.
//		driver.findElement(By.name("email")).sendKeys("user@test.com");
//		driver.findElement(By.name("password")).sendKeys("Testuser@123");
		
		//2.
//		WebElement emailId =  driver.findElement(By.name("email"));
//		WebElement password =  driver.findElement(By.name("password"));

		
		
//		emailId.sendKeys("user@test.com");
//		password.sendKeys("Testuser@123");
		
		//3. By locator
//		By emailId = By.name("email");
//		By password = By.name("password");
//		
//		WebElement email_ele =  driver.findElement(emailId);
//		WebElement password_ele =  driver.findElement(password);
//		
//		email_ele.sendKeys("user@test.com");
//		password_ele.sendKeys("Testuser@123");
		
		//4.By Locator + generic Mathod for webelement
//		By emailId = By.name("email");
//		By password = By.name("password");
//		
//		getElement(emailId).sendKeys("user@test.com");
//		getElement(password).sendKeys("Testuser@123");
		
		//5.By Locator + generic Mathod for webelement
//		By emailId = By.name("email");
//		By password = By.name("password");
//		
//		doSendKeys(emailId,"user@test.com");
//		doSendKeys(password,"Testuser@123");
		
		
		//6.By Locator + generic Mathod for webelement and action in ElementUtil class
		By emailId = By.name("email");
		By password = By.name("password");
		
		ElementUtil elUtil =  new ElementUtil(driver);
		elUtil.doSendKeys(emailId, "user@test.com");
		elUtil.doSendKeys(password, "Testuser@123");
		
		
		
	}
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

}
