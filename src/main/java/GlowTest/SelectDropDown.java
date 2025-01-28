package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	static WebDriver driver;
	public static void main(String[] args) {
		//Drop-Down -- html <Select>
		//Can use only for select Tag
		//select -- option then use <Select> class
		
		driver = new ChromeDriver();
		driver.get("http://localhost:5173/addproduct");
		
		By prodCategory = By.className("add-product-selector");
//		WebElement prodElement = driver.findElement(prodCategory);
//		Select select = new Select(prodElement);
//		
		//select.selectByVisibleText("Lips");
		//select.selectByIndex(3);
		//select.selectByValue("face");
		//select.selectByContainsVisibleText("");
		doDropdownSelectByVisibleText(prodCategory, "Lips");
		doDropdownSelectByIndex(prodCategory, 2);
		doDropdownSelectByValue(prodCategory, "bestseller");
		int count = getDropdownOptonCount(prodCategory);
		System.out.println(count);
	}
	public static void doDropdownSelectByVisibleText(By locator,String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	public static void doDropdownSelectByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doDropdownSelectByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static int getDropdownOptonCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
//	public static void doDropdownSelect(By locator,String selectType, String text, int index, String value) {
//		Select select = new Select(getElement(locator));
//		switch (selectType.toLowerCase()) {
//		case "visibletext":
//			select.selectByVisibleText(text);			
//			break;
//		case "index":
//			select.selectByIndex(index);			
//			break;
//		case "value":
//			select.selectByValue(value);			
//			break;
//		default:
//			break;
//		}
//	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
}
