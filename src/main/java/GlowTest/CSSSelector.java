package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		By.cssSelector("#input-email");
		
		
		// id
		// #id
		// #input-email
		// tag#id
		// input#input-email
		
		
		// class 
		// .class
		// .form-control
		// tag.classname
		// input.formcontrol
		
		// .c1.c2.c3......cn
		// .classname.classname.classname
		// tagname.classname.classname.classname
		
		// id and class
		// #id.class
		// #username.login-email
		
		//.login-email#username
		
		
		// for any other attribute in cssSelector
		// tagName[attribute='value'];
		// input[name='email']
		
		// input[name='email'] --- css
		// //input[@name='email']  --- xpath
		
		// text in css : NO Support
		
		//contains:
		
		//tag[attr *= 'value']
		//input[placeholder *='email']
		
		// Starts With
		//tag[placement ^= 'email']
		
		//ends - with
		//tag
		//tag[attr $= 'value']
		
		//parent and child
		
		// parentelement : childelement
		// form#hs-login input#username // indirect child
		// form#hs-login > input#username //direct child 
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		WebElement list =  driver.findElement(By.cssSelector("footer a"));
		System.out.println(list);
		
		
		//No BackTracking
		
		// Sibling
		
		// label[for='input-email'] + input
	}

}
