
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BaseClass;
import utils.TestUtils;

public class DisplayedPage extends BaseClass{
	

	//Locators Stored
	@FindBy(xpath = "//a[contains(text(),'Women')]")
	private WebElement womenBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Kurtas & Suits')]")
	private WebElement kurta_Suits;
	
	@FindBy(xpath = "//label[contains(text(),'Kurtas')]")
	private WebElement kurtaCat;
	
	@FindBy(xpath = "//label[contains(text(),'Anouk')]")
	private WebElement anoukBrand;
	
	@FindBy(xpath = "//div[contains(text(),'Aouk')]")
	private WebElement anoukDisplay;
	
	
	public DisplayedPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickKurtas_SuitsBtn() throws Exception {
		TestUtils.MouseOver(womenBtn);
		TestUtils.clickOnElement(kurta_Suits);
		Thread.sleep(2000);
		TestUtils.clickOnElement(kurtaCat);
		Thread.sleep(2000);
		TestUtils.clickOnElement(anoukBrand);
	}
	
	public boolean checkAnoukIsDisplayed() {
		return TestUtils.isDisplayedFunction(anoukDisplay);
	}
	
	
	
}
