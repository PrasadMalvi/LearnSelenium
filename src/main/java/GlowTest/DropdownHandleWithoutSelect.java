package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandleWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {
		//Drop-Down -- html <Select>
		//Can use only for select Tag
		//select -- option then use <Select> class
		
		driver = new ChromeDriver();
		driver.get("http://localhost:5173/addproduct");
		By selectOption =  By.xpath("//select[@name='category']/option");
		selectDropdownValueWithoutSelect(selectOption, "Eye");
		
	}
	
	
	public static void selectDropdownValueWithoutSelect(By locator, String value) {
		List<WebElement> optionList =  driver.findElements(locator);
		
		System.out.println(optionList.size());
		
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
			
		}
	}

}
