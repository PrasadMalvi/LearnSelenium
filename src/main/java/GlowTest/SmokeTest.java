package GlowTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class SmokeTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://localhost:3000/");
		driver.get("http://localhost:3000");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Glownius")) {
			System.out.println("Title is Correct "+title);
		}
		else {
			System.out.println("Title is Wrong "+title);
		}
		
		//Automation steps + Validation Points ==> AUtomation Testing
		
		driver.quit();
	}

}
