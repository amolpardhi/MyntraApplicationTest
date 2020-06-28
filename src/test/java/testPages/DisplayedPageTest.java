package testPages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.BaseClass;
import pages.DisplayedPage;

public class DisplayedPageTest extends BaseClass {

	DisplayedPage displayedPage;

	public DisplayedPageTest() {
		super();
	}

	@BeforeMethod
	public void preCondition() {
		initialization();
		displayedPage = new DisplayedPage();
	}

	@Test
	public void clickKurtas_SuitsBtnTest() throws Exception {
		displayedPage.clickKurtas_SuitsBtn();
		boolean flag = displayedPage.checkAnoukIsDisplayed();
		Assert.assertTrue(flag, "Anouk Brand is not getting displayed.");
	}

//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(3000);
//		driver.quit();
//	}

}
