package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementClick {
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		driver =  brUtil.initDriver("Chrome");
		
		// Click :  Button Link CheckBox, RadioButton Image
		
		brUtil.launchURL("http://localhost:3000/login");
		
		//driver.findElement(By.xpath("//span[@class='signup-link']")).click();
		//driver.findElement(By.className("signup-link")).click();
		 
		System.out.println(brUtil.getPageTitle());
		
		By userName = By.name("username");
		By emailId = By.name("email");
		By password = By.name("password");
		By signupLink = By.className("signup-link");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doClick(signupLink);
		elUtil.doSendKeys(userName, "Prasad");
		elUtil.doSendKeys(emailId, "SelTest@gmail.com");
		elUtil.doSendKeys(password, "Seltest@123");
		//elUtil.doClick(By.xpath("//*[@id=\"root\"]/div[2]/div/button"));
		elUtil.doClick(By.cssSelector("#root > div.loginsignup > div > button"));
	}
	
}
