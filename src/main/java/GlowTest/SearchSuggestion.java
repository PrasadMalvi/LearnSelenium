package GlowTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestion {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		
		ElementUtil elUtil = new ElementUtil(driver);
		By searchFiled = By.className("search-input");
		By suggestions = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div");
		elUtil.suggestionClick(searchFiled,suggestions, "Lak", "Eye Brush" );
		
	}
	
	

}
