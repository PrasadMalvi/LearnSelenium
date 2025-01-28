package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionWithFEAndFES {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		By logo = By.className("hero-img11");
		
		driver.findElement(logo).click(); // NoSuchElementException
		
		List<WebElement> logos = driver.findElements(logo); // Empty List
		System.out.println(logos.size()); // Returns  0
	}

}
