package testscripts;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import genericLibriries.BaseClass;
import genericLibriries.ExcellUtil;
import pomRepository.HomePage;
import pomRepository.LeadsPage;

/**
 * 
 * @author Md istiyak
 *
 */

@Listeners(genericLibriries.ListenerImplementationClass.class)
public class TC_01Test extends BaseClass{

	@Test
	public void testCase01() throws EncryptedDocumentException, IOException, AWTException {
		//navigate to create New Lead Account
		TC_01Test.getcreateLeadaccount();
		LeadsPage leadspage=new LeadsPage(driver);
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		leadspage.getSalutationlistBox().click();
		javaScript.executeScript("arguments[0].click();", leadspage.getSalutionName());
		leadspage.getLeadStatusListBox().click();
		javaScript.executeScript("arguments[0].click();", leadspage.getWorkingLeadStatus());
		javaScript.executeScript("arguments[0].click();", leadspage.getRatingListBox());
		javaScript.executeScript("arguments[0].click();", leadspage.getWarmratingOption());
		javaScript.executeScript("arguments[0].click();", leadspage.getIndustrylistBox());
		javaScript.executeScript("arguments[0].click();", leadspage.getTechnologyOption());
		ExcellUtil excell=new ExcellUtil();
		String[][] inputs= excell.getExcelData("Leadssheet");
		//navigate to enter the data from excell to textfields
		WebElement[] textFields = new WebElement[12];
		textFields[0]=leadspage.getPhoneTextBox();
		textFields[1]=leadspage.getFirstNmaeTextBox();
		textFields[2]=leadspage.getLastNmaeTextBox();
		textFields[3]=leadspage.getCompanyTextBox();
		textFields[4]=leadspage.getTitleTextBox();
		textFields[5]=leadspage.getStreetTextBox();
		textFields[6]=leadspage.getEmailTextBox();
		textFields[7]=leadspage.getCityTextBox();
		textFields[8]=leadspage.getProvinceTextBox();
		textFields[9]=leadspage.getPostalCodeTextBox();
		textFields[10]=leadspage.getCountryTextBox();
		textFields[11]=leadspage.getNumberOfEmployeesTextBox();
		for (int i = 1; i < inputs.length; i++) {
			for (int j = 0; j <textFields.length; j++) {
				try {
					textFields[j].sendKeys(inputs[i][j]);
				}catch (Exception e) {
				}
			}
			leadspage.getSaveButton().click();
		}
		Assert.assertTrue(leadspage.getLeadAccountnameText().getText().contains(inputs[1][1]),"fail0");
		Reporter.log("Leads account is created successfully",true);
		//navigate to assert all the inputs matches or not
		WebElement[] assertText = new WebElement[16];
		assertText[0]=leadspage.getPhoneText();
		assertText[1]=leadspage.getFirstNameText();
		assertText[2]=leadspage.getLastNameText();
		assertText[3]=leadspage.getCompanyText();
		assertText[4]=leadspage.getTitleText();
		assertText[5]=leadspage.getStreetText();
		assertText[6]=leadspage.getEmailText();
		assertText[7]=leadspage.getCityText();
		assertText[8]=leadspage.getStateText();
		assertText[9]=leadspage.getCodetext();
		assertText[10]=leadspage.getCountryText();
		assertText[11]=leadspage.getNoOfEmployeestext();
		assertText[12]=leadspage.getLeadAccountnameText();
		assertText[13]=leadspage.getWorkingText();
		assertText[14]=leadspage.getWarmText();
		assertText[15]=leadspage.getTechnologyText();
		for (int i = 1; i < inputs.length; i++) {
			for (int j = 0; j <assertText.length; j++) {
				try {
					Assert.assertTrue(assertText[j].getText().contains(inputs[i][j]), "assertion is fail");
				}catch (Exception e) {
				}
			}
			Reporter.log("all the inputs are matched successfully",true);
		} 
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
