package GlowTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ClassBrowser {

	public static void main(String[] args) {
	
				String browser = "chrome";
				
				WebDriver driver = null;
				switch (browser.trim().toLowerCase()) {
				case "chrome":
					driver = new ChromeDriver();
					break;
				case "edge":
					driver = new EdgeDriver();
					break;
				case "firefox":
					driver = new FirefoxDriver();
				  	break;
				default:
					System.out.println("Please Enter Valid Url With http");
					throw new BrowserException("======Inavlid Browser======");
				}
				driver.get("http://localhost:3000/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.quit();
			}
	}
