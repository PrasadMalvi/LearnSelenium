package GlowTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandles {
	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		driver =  brUtil.initDriver("Chrome");
		
		// Click :  Button Link CheckBox, RadioButton Image
		
		brUtil.launchURL("http://localhost:3000/login");
		Set<String> x = driver.getWindowHandles();
		System.out.println(x);
		Iterator<String> h = x.iterator();
		String window1 = h.next();
		String window2 = h.next();
		
		driver.switchTo().window(window2);
	}

}
