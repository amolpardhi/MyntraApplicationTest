package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePage.BaseClass;

public class TestUtils extends BaseClass {

	public static long Pageload_Timeout = 45;
	public static long Implicit_Wait = 30;
	
	//ClickOnElement
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// Generic function for MouseHover
	public static void MouseOver(WebElement we) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(we).build().perform();
	}

	// Generic Method for isDisplayed();
	public static boolean isDisplayedFunction(WebElement we) {
		
		try {
			we.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
