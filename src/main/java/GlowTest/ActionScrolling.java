package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrolling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		action.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		
//		Thread.sleep(2000);
//		action.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//	
		
		//Scroll To
		
		action.scrollToElement(driver.findElement(By.linkText("About Us"))).click(driver.findElement(By.linkText("About Us"))).perform();
	}

}
