package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiMenuHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By level1 = By.xpath("(//span[text()='Shop by'])[2]");
		By level2 = By.linkText("Beverages");
		By level3 = By.linkText("Tea");
		By level4 = By.linkText("(Green Tea");
		ParentChildMenu(level1, level2, level3, level4);
	}
	public static void ParentChildMenu(By level1, By level2, By level3, By level4) throws InterruptedException {
		getElement(level1).click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level2)).perform();
		Thread.sleep(3000);
		action.moveToElement(getElement(level3)).perform();
		Thread.sleep(10000);
		getElement(level4).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
