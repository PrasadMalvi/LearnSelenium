package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightContextClick {
	static WebDriver driver;
	public static void main(String[] args){
		//Drag and Drop
		//Element to Element
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action = new Actions(driver);
		
//		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
//		driver.findElement(By.xpath("//span[text()='Copy']")).click();
//		List<WebElement> list= driver.findElements(By.cssSelector("ul.context-menu-list span"));
//		for(WebElement e:list) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
//		rightClickAndSelectOption(By.xpath("//span[text()='right click me']"), "Copy");
	}
	public static void rightClickAndSelectOption(String elementLocator, String optionText) {
        Actions action = new Actions(driver);
        List<WebElement> options = getElements(By.cssSelector(elementLocator));
        for (WebElement option : options) {
            String text = option.getText();
            System.out.println(text);
            if (text.equals(optionText)) {
                option.click();
                break;
            }
        }
    }
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}


}
