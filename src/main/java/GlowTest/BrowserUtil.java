package GlowTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserUtil {
	WebDriver driver;
	public WebDriver initDriver(String browserName) {
		System.out.println("Broswer Name :" + browserName);
		
		switch (browserName.trim().toLowerCase()) {
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
		
		return driver;
	}
	
	public void launchURL(String url) {
		if(url.indexOf("http") != 0 || url.length() == 0) {
			throw new BrowserException("http(s) is Missing in the URL");
		}
		driver.get(url);
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}
}
