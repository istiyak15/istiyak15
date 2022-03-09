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
		TC_01Test.getcreateLeadaccount1();
		LeadsPage leadspage=new LeadsPage(driver);
		leadspage.getSaveButton().click();
		Assert.assertEquals(driver.getTitle(), "Recently Viewed | Leads | Salesforce");
	}
	
}
