package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// Xpath: XML Path: HTML XML Path: address of the element in the DOM

		//DOM: HTML + XML
		
		//1.Absolute Xpath : /India -> /Karnataka -> /Bangalore -> /Electronic city -> /Hebbagodi -> /Kammasandra 
		//2.Relative Xpath : relative attribute of the element : id, class, name, type, text
		
		//hmtlTag[@attribute='value']
		
		//input[@id='input-name'] --1
		//input[@name='input-name'] --2
		//input[@type='text'] --3
		
		//htmlTag[@attribute1='value' and attribute2='value'] ---4
		//input[@name='name' and @placeholder='Type Here'] 
		//input[@name='name' and @placeholder='Type Here' and @placeholder='Type Here'] 
		//input[@name='name' and @placeholder='Type Here' and @placeholder='Type Here' and @placeholder='Type Here'] 
	
		
		//input[@name='name' or @placeholder='Type Here']
		
		
		//text:
		
		//htmlTag[text()='value']
		////button[text()='Add Product']
		//p[text()='Price']
		//label[@for='file-input']
		
		
		//Contains
		
		
		//htmlTag[contains(@attribute,value)]
		//input[contains(@id,'input')]
		//htmlTag[contains(@attribute1,value1)] and //htmlTag[contains(@attribute2,value)]
		//input[contains(@name,'name') and contains(@placeholder,'Type')]
		
		
		//Contains with text()
		//p[contains(text(),'Title')]
		//htmlTag[contains(text(),'value')]
		//p[contains(text(),'Product')]
		
		//starts with
		//input[starts-with(@placeholder,'Em')]
		
		
		//endswith not available
		
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://localhost:3000");
//		By text = By.xpath("//p[contains(text(),'NEW')]");
//		By textStartWith = By.xpath("//input[starts-with(@placeholder,'Em')]");
//		
//		System.out.println(text);
//		System.out.println(textStartWith);
		
//		driver.get("https://app.hubspot.com/login");
		
		
		//class
		
		//not valid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//InvalidSelectorException: Compound class names not permitted
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		
		//InvalidSelectorException: invalid selector
		//driver.findElement(By.xpath("//input[@@@@id,testing//test/option]")).sendKeys("sdbsb ");
	
		
		//Indexing in Xpath
		//*[@class='best_seller-section'][1]/div[1]/div/a[1]
//		driver.findElement(By.xpath("//*[@class='best_seller-section'][1]/div[1]/div/a[1]")).click();
		
		driver.get("http://localhost:3000/login");
		driver.findElement(By.xpath("//div[@class='loginsignup-container']/div/input[1]")).sendKeys("Prasad");
		
		//first
		//div[@class='loginsignup-container']/div/input[1]
		//div[@class='loginsignup-container']/div/input[poistion=1]
		
		//last 
		//div[@class='loginsignup-container']/div/input[last()]
		//div[@class='loginsignup-container']/div/input[poistion=last()]
		//div[@class='loginsignup-container']/div/input[last()-1]
		
		//Amazon footer
		//(//div[@id='navFooter']/div/div/div[7]/ul/li//a)[last()]
	}

}
