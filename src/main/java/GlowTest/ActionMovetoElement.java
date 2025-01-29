package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMovetoElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
//		By addons = By.xpath("//div[text()='Add-ons']");
//		By visServises = By.xpath("//div[tex()='Visa Services']");
		
		//ParentChildMenu("Add-ons","Visa Services");
		ParentChildMenu("SpiceClub","Benefits");
		
	}
	public static void ParentChildMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	}
	
	public static void ParentChildMenu(String parentMenu, String childMenu) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(By.xpath("//*[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(3000);
		getElement(By.xpath("//*[tex()='"+childMenu+"']")).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
