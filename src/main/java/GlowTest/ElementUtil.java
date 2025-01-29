package GlowTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	private Actions action;
	
	//Created An utility for an Elements By Passing the WebDriver
	public ElementUtil(WebDriver driver) {
		this.driver =  driver;
		action = new Actions(driver);
	}
	
	//To get a Multiple Element
		public List<WebElement> getElements(By locator){
			return driver.findElements(locator);
		}
		
	//To Click Any Button
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	//To get a Single Element
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//To Print a Multiple Element Text
	public void printElementTextList(By locator) {
		List<String> eleText = geElementsTextList(locator);
		for(String e : eleText) {
			System.out.println(e);
		}
	}
	
	//To get a Multiple Element Text List
	public List<String> geElementsTextList(By locator) {
		List<WebElement> elList = getElements(locator);
		List<String> elListText = new ArrayList<String>();
		for(WebElement e : elList) {
			String elText = e.getText();
			if(elText.length() != 0) {
				elListText.add(elText);
			}
			
		}
		return elListText;
	}
	
	//To get a Multiple Element Count
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//To Check whether the element is present of not for more than one
	public boolean isElementPresent(By locator, int expectedElementCount) {
		if (getElementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}
	
	//To Check whether the element is present of not 
	public boolean isElementPresent(By locator) {
		if (getElementsCount(locator)==1) {
			return true;
		}
		return false;
	}
	
	//to Check if Element is Present Multiple Times
	public boolean isElementPresentMultipleTimes(By locator) {
		if (getElementsCount(locator)>=1) {
			return true;
		}
		return false;
	}
	
	//To Check if Element Is Not Present
	public boolean isElementIsNotPresent(By locator) {
		if(getElementsCount(locator) == 0) {
			return true;
		}
		return false;
	}
	
	//To Send Keys for an Element Which will enter data in element
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	//Check Whether the the Element is Displayed
	public boolean isElemeneDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not Displayed : "+ locator);
			return false;
		}
	}
	
	//Check Whether the the Element is Selected
	public boolean isElementSelected(By locator) {
		try {
			return getElement(locator).isSelected();
		} catch (Exception e) {
			System.out.println("Element is not selected");
			return false;
		}
	}
	
	//Check Whether the the Element is Enabled
	public boolean isElementEnabled(By locator) {
		try {
			return getElement(locator).isEnabled();
		} catch (Exception e) {
			System.out.println("Element is not Enabled");
			return false;
		}
	}
	
	//To get an Element Text
	public String doGetElementText(By locator) {
		String eleText = getElement(locator).getText();
		if(eleText != null) {
			return eleText;
		}else {
			System.out.println("Element text is null: "+eleText);
			return null;
		}
	}
	
	//for Search Suggestion Click
	public boolean suggestionClick(By searchFiled, By suggestions, String searchKey,  String matchValue) {
		
		boolean flag = false;
		doSendKeys(searchFiled, searchKey);
		
		List<WebElement> suggList = getElements(suggestions);
		int totalSuggestions = suggList.size();
		System.out.println("The total number suggestion :  " + totalSuggestions);
		
		if(totalSuggestions == 0) {
			System.out.println("No suggestion found");
			throw new FrameworkException("No Suggestion FOUND");
		}
		for(WebElement e : suggList ) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(matchValue)) {
				e.click();
				flag  = true;
				break;
			}
		}
		if(flag) {
			System.out.println(matchValue + "The match value Found");
			return true;
			
		}
		else {
			System.out.println(matchValue + "The match value Not Found");
			return false;
		}
	}
	
	
	//************************SELECT DROP DOWN**********************//
	private Select getSelect(By locator) {
		return new Select(getElement(locator));
	}
	
	//To Select a dropdown by Visible Text
	public void doDropdownSelectByVisibleText(By locator,String visibleText) {
		getSelect(locator).selectByVisibleText(visibleText);
	}
	
	////To Select a dropdown by INdex value
	public void doDropdownSelectByIndex(By locator,int index) {
		getSelect(locator).selectByIndex(index);
	}
	
	//To Select a dropdown by Value
	public void doDropdownSelectByValue(By locator,String value) {
		getSelect(locator).selectByValue(value);
	}
	
	//To Check how many Option are there in the  dropdown
	public int getDropdownOptonCount(By locator) {
		return getSelect(locator).getOptions().size();
	}
	
	// To get the Text from the Dropdown Option list Using Select
	public List<String> getDropdownOptionTextList(By locator) {
		List<WebElement> optionList = getSelect(locator).getOptions();
		System.out.println("The total number of Options : " +optionList.size());
		List<String> optionTextList = new ArrayList<String>();
		for(WebElement e : optionList) {
			String text = e.getText();
		optionTextList.add(text);
		}
		return optionTextList;
	}
	
	// To get the Text from the Dropdown Option list withount using select but different approach
	public void selectDropdownValueUsingSelect(By locator, String value) {
			List<WebElement> optionList =  getSelect(locator).getOptions();
			selectDropdown(optionList, value);
		}
	
	//To Select Dropdwon without using Select
	public void selectDropdownValueWithoutSelect(By locator, String value) {
		List<WebElement> optionList =  getElements(locator);
		selectDropdown(optionList, value);
	}
	
	//Select DropDown 
	private  void selectDropdown(List<WebElement> optionList, String value) {
		System.out.println("The total number of Options : " + optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
			
		}
	}
	
	
	/*************************Action Util*************************/
	
	
	//Action Class which Maintain 2 lever of parent and child using By locator
	public void ParentChildMenu(By parentMenu, By childMenu) throws InterruptedException {
		action.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		doClick(childMenu);
	}
	
	//Action Class which Maintain 2 lever of parent and child using String
	public void ParentChildMenu(String parentMenu, String childMenu) throws InterruptedException {
		action.moveToElement(getElement(By.xpath("//*[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(3000);
		doClick(By.xpath("//*[tex()='"+childMenu+"']"));
	}
	
	//For 4 Levels ACtion
	public void ParentChildMenu(By level1, By level2, By level3, By level4) throws InterruptedException {
		doClick(level1);
		action.moveToElement(getElement(level2)).perform();
		Thread.sleep(3000);
		action.moveToElement(getElement(level3)).perform();
		Thread.sleep(10000);
		getElement(level4).click();
	}
	
	// to click on any option using action
	public void doActionClick(By locator) {
		action.click(getElement(locator)).perform();
	}
	
	// To send values of text to any files using action
	public void doActionSendKeys(By locator, String value) {
		action.sendKeys(driver.findElement(locator), value).perform();
	}
	
	//to Send the keys with an specific pause time
	public void doActionSendKeysWithPause(By locator, String value, long pauseTime) {
		Actions action = new Actions(driver);
		char ch[] = value.toCharArray();
		 
		for(char c:ch) {
			action.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
			
		}
	}
	
	
}