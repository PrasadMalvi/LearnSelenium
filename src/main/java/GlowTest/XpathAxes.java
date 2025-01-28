package GlowTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	static WebDriver driver ;
	public static void main(String[] args){
		
		//label[normalize-space()='No']
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//parent to direct child
		//form[@id='hs-login']//input[@id='username']
		
		//form[@id='hs-login']/div -- 8(direct child element)
		//form[@id='hs-login']//div 23 (direct + indirect child element)
		

		//select[@id='Form_getForm_Country']/option -- direct(233) = 233
		//select[@id='Form_getForm_Country']//option -- direct(233) + indirect = 233
		
		
		
		//child to parent
		//Back Traversing 
		//input[@id='username']/../../../../../../../../../../../../../../../../..
		//input[@id='username']/..
		//input[@id='username']/parent::div --  only for immediate parent
		
		//input[@id='username']/ancestor::form
		//input[@id='username']/ancestor::div[@class='page']
		
		//a[text()='Joe.Root']/ancestor::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Jasmine.Morgan']/ancestor::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//		selectUserCheckBox("Joe.Root");
//		selectUserCheckBox("Jasmine.Morgan");
		
//		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		
//		for (WebElement e : userDetails) {
//			String text = e.getText();
//			System.out.println(text);
//			
//		}
		System.out.println(getUserDetails("Joe.Root"));
		System.out.println(getUserDetails("Jasmine.Morgan"));
		
		System.out.println();
	}
	public static List<String> getUserDetails(String username){
		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
		List<String> userDetailList =  new ArrayList<String>();
		for (WebElement e : userDetails) {
			String text = e.getText();
			userDetailList.add(text);
			
		}
		return userDetailList;
	}
	
	
	public static void selectUserCheckBox(String username){
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
