package GlowTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/login");

        // Interface Casting
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String title = js.executeScript("return document.title;").toString();
//        
//        System.out.println("Page Title is: " + title);
//        
//        String url = js.executeScript("return document.URL;").toString();
//        
//        System.out.println("Page Title is: " + url);
        
        JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//        String title =  jsUtil.getPageTitle();
//        System.out.println(title);
////        jsUtil.generateAlert("Hello Prasad!!!");
//        String pageText = jsUtil.getPageText();
//        System.out.println(pageText);
//        if(pageText.contains("Powered and secured by Prasad Malvi.")) {
//        	System.out.println("Pass");
//        }
        driver.manage().window().maximize();
        
//        WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[4]/p[1]"));
//        jsUtil.toscrollIntoView(ele);
        
//        jsUtil.drawBorder(ele);
        WebElement  logignForm = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div"));
        WebElement  email = driver.findElement(By.name("email"));
//     
//        jsUtil.drawBorder(logignForm);
//        jsUtil.drawBorder(email);
       
        jsUtil.flash(logignForm);
        jsUtil.flash(email);
        
        
    }
//    public static String getTitle() {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//        String title = js.executeScript("return document.title;").toString();
//        return title;
//    }
//    public static String getURL() {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//        String url = js.executeScript("return document.title;").toString();
//        return url;
//    }
    
}
