package GlowTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/login");
		
		Actions action = new Actions(driver);
		driver.findElement(By.className("signup-link")).click();
		WebElement name = driver.findElement(By.name("username"));
		
		Action action1 = action.sendKeys(name,"Prasad")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("prasad1@gmail.com")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("Prasad@344")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.ENTER).build();
		
		action1.perform();
	}

}
