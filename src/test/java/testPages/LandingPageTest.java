package testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.BaseClass;
import pages.LandingPage;

public class LandingPageTest extends BaseClass {

	LandingPage landingPage;

	public LandingPageTest() {
		super();
	}

	@BeforeMethod
	public void preCondition() {
		initialization();
		landingPage = new LandingPage();
	}

	@Test(priority = 1)
	public void verifyLandingPageTitleTest() {
		String pageTitle = landingPage.verifyLandingPageTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	}

	@Test(priority = 2)
	public void verifyMyntraImgLogoTest() {
		boolean flag = landingPage.verifyMyntraImgLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void verifySideBarTest() throws Exception {
		Thread.sleep(2000);
		landingPage.verifySideBar();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void verifyAppliancesBtnTest() throws Exception {
		landingPage.verifyAppliancesBtn();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 5)
	public void verifySignupBtnTest() throws Exception {
		landingPage.verifySignupBtn();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
