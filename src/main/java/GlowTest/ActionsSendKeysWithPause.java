package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {
	static WebDriver driver;
	public static void main(String[] args){
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		
		By search = By.className("search-input");
//		WebElement seachEle = driver.findElement(search);
//		String searchname = "lak";
//		
//		char ch[] = searchname.toCharArray();
//		 
//		for(char c:ch) {
//			action.sendKeys(seachEle, String.valueOf(c)).pause(200).perform();
//			
//			
//		}
		
		doActionSendKeysWithPause(search,"lak", 200);
	}
	public static void doActionSendKeysWithPause(By locator, String value, long pauseTime) {
		Actions action = new Actions(driver);
		char ch[] = value.toCharArray();
		 
		for(char c:ch) {
			action.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
			
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
