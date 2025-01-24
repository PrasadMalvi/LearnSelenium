package GlowTest;

public class GlowWebTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("http://localhost:3000/");
		
		String title = brUtil.getPageTitle();
		if(title.contains("Glownius")) {
		System.out.println("Title Pass");
		}else {
			System.out.println("Title Fail");
		}
		System.out.println(brUtil.getPageURL());
		brUtil.quitBrowser();
	}

}
