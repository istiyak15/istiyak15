package testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import genericLibriries.BaseClass;
import pomRepository.HomePage;
import pomRepository.LeadsPage;

/**
 * 
 * @author Md istiyak
 *
 */


public class TC_02Test extends BaseClass{

	@Test(priority=1)
	public void Scenario_02() {
		TC_01Test.getcreateLeadaccount();
		LeadsPage leadspage=new LeadsPage(driver);
		leadspage.getSaveButton().click();
		Assert.assertEquals(driver.getTitle(), "Recently Viewed | Leads | Salesforce");
	}
	public static void getcreateLeadaccount() {
		HomePage homepage=new HomePage(driver);
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		homepage.getDotIcon().click();
		javaScript.executeScript("arguments[0].click();", homepage.getViewAllLink());
		Assert.assertEquals(homepage.getAppLauncherpopupText().getText(), "App Launcher");
		Reporter.log("App Launcher popup is displayed successfully",true);
		homepage.getSearchAppTextField().sendKeys("LEADS");
		homepage.getLeadsLink().click();
		LeadsPage leadspage=new LeadsPage(driver);
		Assert.assertEquals(leadspage.getRecentlyViewedText().getText(), "Recently Viewed");
		Reporter.log("Leads page is displayed successfully",true);
		leadspage.getCreateNewLink().click();
		Assert.assertEquals(leadspage.getNewLeadtext().getText(), "New Lead");
		Reporter.log("new Leads popup is displayed successfully",true);
	}
}
