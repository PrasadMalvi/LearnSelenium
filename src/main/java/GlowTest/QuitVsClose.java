package GlowTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Glownius")) {
			System.out.println("Title is Correct "+title);
		}
		else {
			System.out.println("Title is Wrong "+title);
		}
		
		//driver.findElement(By,"")
		
		//Automation steps + Validation Points ==> AUtomation Testing
		
		//driver.quit();
		driver.close();
		System.out.println(driver.getTitle());
	}

}
