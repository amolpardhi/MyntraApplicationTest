package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BaseClass;
import utils.TestUtils;

public class LandingPage extends BaseClass{

	//Locators
	//Myntra Image element
	@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	WebElement myntraImglogo;
	
	//Side bar element
	@FindBy(xpath = "//div[@class=' FreeShippingBanner-sidebar FreeShippingBanner-sidebar-collapsed']")
	WebElement sideBar;
	
	//Essentials btn
	@FindBy(xpath = "//a[contains(text(),'Essentials')]")
	WebElement essentialsBtn;
	
	//Appliances btn in Essentials tab
	@FindBy(xpath = "//a[contains(text(),'Appliances')]")
	WebElement appliancesBtn;
	
	//Profile btn
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	WebElement profileBtn;
	
	//Signup Btn
	@FindBy(xpath = "//a[contains(text(),'login / Signup')]")
	WebElement signUpBtn;
	
	//Constructor
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String verifyLandingPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyMyntraImgLogo() {
		return myntraImglogo.isDisplayed();
	}
	
	public void verifySideBar() {
		TestUtils.clickOnElement(sideBar);
	}
	
	public void verifyAppliancesBtn() {
		TestUtils.MouseOver(essentialsBtn);
		TestUtils.clickOnElement(appliancesBtn);
	}
	
	public void verifySignupBtn() {
		TestUtils.MouseOver(profileBtn);
		signUpBtn.click();
	}
	
}
