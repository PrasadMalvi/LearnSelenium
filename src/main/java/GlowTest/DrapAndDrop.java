package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop {
	static WebDriver driver;
	public static void main(String[] args){
		//Drag and Drop
		//Element to Element
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/HTML/html5_draganddrop.asp");
		
		By sourseEle = By.id("div1");
		By targetEle = By.id("div2");
		
		Actions action = new Actions(driver);
//		Action drapgAdnDrop = action.clickAndHold(driver.findElement(sourseEle))
//		.moveToElement(driver.findElement(targetEle))
//		.release().build();
//		
//		drapgAdnDrop.perform();
		
		//.build() ---  no
		//.perform() --- yes
		//.build().perform() -- yes
		
		//build() -- return action -- can be reused
		//.perform --  return void 
		
		//Action --  class -- is used for bulder pattern using method chaining to perform various actions in sequence
		//Action -- Interface -- build() will return Action (single or composite) -- which can be used later to perform
		
		action.dragAndDrop(driver.findElement(sourseEle), driver.findElement(targetEle)).perform();
	}
	

}
