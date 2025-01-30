package GlowTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//JS ALERTS:
		//1.alert
		//2.confirm
		//3.promtb 
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		//alert click okey
//		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//	alert.dismiss();
		
		//Confirm Click
//		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
////		alert.accept();
//		alert.dismiss();
		
		
		//Prompt 
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("Prasad");
		alert.accept();
//		alert.dismiss();
	}

}
