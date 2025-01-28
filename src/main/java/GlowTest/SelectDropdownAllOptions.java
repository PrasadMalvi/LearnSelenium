package GlowTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllOptions {
	static WebDriver driver;
	public static void main(String[] args) {
		//Drop-Down -- html <Select>
		//Can use only for select Tag
		//select -- option then use <Select> class
		
		driver = new ChromeDriver();
		driver.get("http://localhost:5173/addproduct");
		
		By prodCategory = By.className("add-product-selector");
		
		// Single Value seding 
		if(getDropdownOptionTextList(prodCategory).contains("Lips")) {
			System.out.println("PASS");
		}
		
		//Sending Multiple Values
		List<String> expectedList = Arrays.asList("Face","Lips");
		if(getDropdownOptionTextList(prodCategory).containsAll(expectedList));
		System.out.println("Pass");
	}
	
//	public static void toCheckDropContainValue(By locator, String expectedList) {
//		if(getDropdownOptionTextList(locator).contains(expectedList));
//		System.out.println("Pass");
//	}
	
	
	
	public static List<String> getDropdownOptionTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size());
		List<String> optionTextList = new ArrayList<String>();
		for(WebElement e : optionList) {
			String text = e.getText();
			optionTextList.add(text);
		}
		return optionTextList;
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}

}
