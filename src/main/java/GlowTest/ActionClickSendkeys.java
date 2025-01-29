package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickSendkeys {
	static WebDriver driver;
	public static void main(String[] args){
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/login");
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(By.xpath("//input[@type='email']")), "text@gmail.com").perform();
		action.sendKeys(driver.findElement(By.xpath("//input[@type='password']")), "text@gmail.com").perform();
		action.click(driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/button"))).perform();
		
		
		//WebEle .send keys -- send keys 
		//ACtions .send keys -- move -- click -- send keys --  user actions
		
		// WE .click -- send keys
		//AC .click - move -- click -- send keys -- user action
		
		// TWO/THREE ways of entering the values into a Text filed
		//WE.SK
		//AC.SK
		//JS.CK
	} 
	public static void doActionClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	public static void doActionSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(locator), value).perform();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
