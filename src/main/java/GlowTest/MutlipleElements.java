package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/login");
		List<WebElement> linkList =	driver.findElements(By.tagName("a"));
		int totalLinks = linkList.size();
		System.out.println("Total No of Links Are : "+ totalLinks);
		
		for(int i = 0; i < totalLinks; i++) {
			String text = linkList.get(i).getText();
			System.out.println(text);
		}
		int count = 0;
		for(WebElement e : linkList) {
			String text = e.getText();
			
			if(text.length() != 0) {
				
				System.out.println(count + " = "+text);
			}
			count ++;
		}
	}

}
