package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsPresent {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		
		By logo = By.className("hero-img");
		By checkLinks = By.xpath("//*[@id=\"root\"]/nav/ul/li[1]/a");
		By test = By.tagName("test");
//		int count = driver.findElements(logo).size();
//		if (count == 1) {
//			System.out.println("Logo is Present");
//		} else {
//			System.out.println("Logo is Not Present");
//		}
		
		System.out.println(isElementPresent(logo));
		System.out.println(isElementPresent(checkLinks, 1));
		System.out.println(isElementPresent(test, 0));
	}
	public static boolean isElementPresent(By locator, int expectedElementCount) {
		if (getElementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}
	public static boolean isElementPresent(By locator) {
		if (getElementsCount(locator)==1) {
			return true;
		}
		return false;
	}
	//To get a Multiple Element Count
		public static int getElementsCount(By locator) {
			return getElements(locator).size();
		}
		
		//To get a Multiple Element
		public static List<WebElement> getElements(By locator){
			return driver.findElements(locator);
		}
		public static boolean isElementIsNotPresent(By locator) {
			if(getElementsCount(locator) == 0) {
				return true;
			}
			return false;
		}
		public static boolean isElementPresentMultipleTimes(By locator) {
			if (getElementsCount(locator)>=1) {
				return true;
			}
			return false;
		}
			
}
