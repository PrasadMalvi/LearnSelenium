package GlowTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	private WebDriver driver;
	public JavascriptExecutor js;
	
	//Created Constructor to store driver and fetch for all
	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor)driver;
	}
	
	
	//To get the Page tile using Javscript
	public String getPageTitle() {
        return js.executeScript("return document.title;").toString();
    }
	
	// to get the page URL uring javascript
    public String getPageURL() {
        return js.executeScript("return document.title;").toString();
    }
    
    //to get generate the ALert Prompt using JS
    public void generateAlert(String msg) {
    	js.executeScript("alert('"+msg+"')");
    }
    
    
    // to get the Entire Page  text
    public String getPageText() {
    	return js.executeScript("return document.documentElement.innerText;").toString();
    }
    
    //To go back with to the previous Page
    public void goBackWithJS() {
    	js.executeScript("history.go(-1)");
    }
    
  //To go forward with to the previous Page
    public void goForwardWithJS() {
    	js.executeScript("history.go(1)");
    }
    
  //To Refresh the page with Page
    public void goRefreshJS() {
    	js.executeScript("history.go(0)");
    }
    
    public void zoomChromeEdgeSafariFirefox(String zoomPercentage) {
    	String zoom = "document.body.style.zoom '"+ zoomPercentage + "%'";
    	js.executeScript(zoom);
    }
    public void toScrollPageMiddle() {
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
    }
    public void toScrollPageDown() {
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }
    
    public void toScrollPageUp() {
    	js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
    }
    public void toScrollDown(String height) {
    	js.executeScript("window.scrollTo(0, '"+height+"');");
    }
    
    public void toscrollIntoView(WebElement element) {
    	js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    
    public void drawBorder(WebElement element) {
    	js.executeScript("arguments[0].style.border='3px solid red'",element);
    }
    
    public void flash(WebElement element) {
    	String bgColor = element.getCssValue("backgroundColor");
    	for(int i = 0; i < 20; i++) {
    		changeColor("rgb(0,200,0)",element);
    		changeColor(bgColor,element);
    	}
    }
    private void changeColor(String color, WebElement element) {
    	js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
    	try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
    }
}
