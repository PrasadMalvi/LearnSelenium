package GlowTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakingScreenshot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		BrowserUtil brUtil = new BrowserUtil();
		driver =  brUtil.initDriver("Chrome");
		
		brUtil.launchURL("http://localhost:3000/login");
		 TakesScreenshot screenshot = (TakesScreenshot) driver;
         File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
         File destFile = new File("screenshot.png");
         FileUtils.copyFile(srcFile, destFile);

         System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
	}

}
