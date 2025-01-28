package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/login");
		ElementUtil elUtil = new ElementUtil(driver);
		
		
		By images =  By.tagName("a");

		
//		int imageCount =  elUtil.getElementsCount(images);
//		System.out.println(imageCount);
		
		elUtil.printElementTextList(images);
	}
	
	
}
