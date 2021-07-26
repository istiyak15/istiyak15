package pomRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Md istiyak
 *
 */

public class LeadsPage {

	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[.='Recently Viewed']")
	private WebElement recentlyViewedText;

	@FindBy(xpath="//div[.='New']")
	private WebElement createNewLink;

	@FindBy(xpath="//h2[.='New Lead']")
	private WebElement newLeadtext;

	@FindBy(xpath="//input[contains(@aria-controls,'d')]//following::input[contains(@aria-controls,'d')]//following::input[contains(@aria-controls,'d')]")
	private WebElement salutationlistBox;
	
	@FindBy(xpath="//span[@title='Mr.']")
	private WebElement SalutionName;


	public WebElement getSalutionName() {
		return SalutionName;
	}

	@FindBy(xpath="//input[contains(@aria-controls,'dropdown-element')]//following::input[contains(@aria-controls,'dropdown-element')]")
	private WebElement LeadStatusListBox;

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNmaeTextBox;

	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNmaeTextBox;

	@FindBy(xpath="//input[@name='Phone']")
	private WebElement phoneTextBox;

	@FindBy(xpath="//input[@name='Company']")
	private WebElement companyTextBox;

	@FindBy(xpath="//input[@name='Email']")
	private WebElement emailTextBox;

	@FindBy(xpath="//input[@name='Title']")
	private WebElement TitleTextBox;

	@FindBy(xpath="//input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]")
	private WebElement ratingListBox;

	@FindBy(xpath="//textarea[@name='street']")
	private WebElement streetTextBox;

	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTextBox;

	@FindBy(xpath="//input[@name='province']")
	private WebElement provinceTextBox;

	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement postalCodeTextBox;

	@FindBy(xpath="//input[@name='country']")
	private WebElement countryTextBox;

	@FindBy(xpath="//input[@name='NumberOfEmployees']")
	private WebElement NumberOfEmployeesTextBox;

	@FindBy(xpath="//input[@name='AnnualRevenue']")
	private WebElement AnnualRevenueTextBox;

	@FindBy(xpath="//input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]//following::input[contains(@aria-haspopup,'l')]")
	private WebElement industrylistBox;

	@FindBy(xpath="//button[@name='SaveEdit']")
	private WebElement saveButton;

	@FindBy(xpath="//div[.='Lead']/..//lightning-formatted-name")
	private WebElement leadAccountnameText;

	@FindBy(xpath="//span[@title='Working']")
	private WebElement workingLeadStatus;

	@FindBy(xpath="//span[text()='Warm']")
	private WebElement warmratingOption;

	@FindBy(xpath="//span[text()='Technology']")
	private WebElement technologyOption;

	public WebElement getViewprofileimg() {
		return viewprofileimg;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	@FindBy(xpath="//img[@class='icon noicon']")
	private WebElement viewprofileimg;

	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement logoutLink;

	public WebElement getWorkingText() {
		return WorkingText;
	}

	public WebElement getPhoneText() {
		return phoneText;
	}

	public WebElement getCompanyText() {
		return companyText;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getTitleText() {
		return titleText;
	}

	public WebElement getWarmText() {
		return warmText;
	}

	public WebElement getFirstNameText() {
		return firstNameText;
	}

	public WebElement getLastNameText() {
		return lastNameText;
	}

	public WebElement getStreetText() {
		return streetText;
	}

	public WebElement getCityText() {
		return cityText;
	}

	public WebElement getStateText() {
		return stateText;
	}

	public WebElement getCodetext() {
		return codetext;
	}

	public WebElement getCountryText() {
		return countryText;
	}

	public WebElement getNoOfEmployeestext() {
		return NoOfEmployeestext;
	}

	public WebElement getTechnologyText() {
		return technologyText;
	}

	@FindBy(xpath="//span[text()='Name']//following::span[text()='Name']/../..//lightning-formatted-name[@data-output-element-id='output-field']")
	private WebElement firstNameText;

	@FindBy(xpath="//span[text()='Name']//following::span[text()='Name']/../..//lightning-formatted-name[@data-output-element-id='output-field']")
	private WebElement lastNameText;

	@FindBy(xpath="//span[.='Address']/../..//div[@class='slds-truncate']")
	private WebElement streetText;

	@FindBy(xpath="//span[.='Address']/../..//div[@class='slds-truncate']//following::div[@class='slds-truncate']")
	private WebElement cityText;

	@FindBy(xpath="//span[.='Address']/../..//div[@class='slds-truncate']//following::div[@class='slds-truncate']")
	private WebElement stateText;

	@FindBy(xpath="//span[.='Address']/../..//div[@class='slds-truncate']//following::div[@class='slds-truncate']")
	private WebElement codetext;
	
	@FindBy(xpath="//lightning-formatted-text[.='Working']")
	private WebElement WorkingText;

	@FindBy(xpath="//span[.='Phone']//following::span[.='Phone']/../..//a")
	private WebElement phoneText;

	@FindBy(xpath="//span[.='Company']//following::span[.='Company']/../..//lightning-formatted-text[@data-output-element-id='output-field']")
	private WebElement companyText;

	@FindBy(xpath="//span[.='Email']//following::span[.='Email']/../..//a")
	private WebElement emailText;

	@FindBy(xpath="//span[.='Title']//following::span[.='Title']/../..//lightning-formatted-text[@data-output-element-id='output-field']")
	private WebElement titleText;

	@FindBy(xpath="//lightning-formatted-text[.='Warm']")
	private WebElement warmText;

	@FindBy(xpath="//span[.='Address']/../..//div[@class='slds-truncate']//following::div[@class='slds-truncate']//following::div[@class='slds-truncate']")
	private WebElement countryText;

	@FindBy(xpath="//span[.='No. of Employees']/../..//lightning-formatted-number[@data-output-element-id='output-field']")
	private WebElement NoOfEmployeestext;

	@FindBy(xpath="//lightning-formatted-text[.='Technology']")
	private WebElement technologyText;

	public void setLogout(WebDriver driver) {
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		javaScript.executeScript("arguments[0].click();", viewprofileimg);
		logoutLink.click();
	}

	public WebElement getWorkingLeadStatus() {
		return workingLeadStatus;
	}

	public WebElement getWarmratingOption() {
		return warmratingOption;
	}

	public WebElement getTechnologyOption() {
		return technologyOption;
	}

	public WebElement getRecentlyViewedText() {
		return recentlyViewedText;
	}

	public WebElement getCreateNewLink() {
		return createNewLink;
	}

	public WebElement getNewLeadtext() {
		return newLeadtext;
	}

	public WebElement getSalutationlistBox() {
		return salutationlistBox;
	}

	public WebElement getLeadStatusListBox() {
		return LeadStatusListBox;
	}

	public WebElement getFirstNmaeTextBox() {
		return firstNmaeTextBox;
	}

	public WebElement getLastNmaeTextBox() {
		return lastNmaeTextBox;
	}

	public WebElement getPhoneTextBox() {
		return phoneTextBox;
	}

	public WebElement getCompanyTextBox() {
		return companyTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getTitleTextBox() {
		return TitleTextBox;
	}

	public WebElement getRatingListBox() {
		return ratingListBox;
	}

	public WebElement getStreetTextBox() {
		return streetTextBox;
	}

	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getProvinceTextBox() {
		return provinceTextBox;
	}

	public WebElement getPostalCodeTextBox() {
		return postalCodeTextBox;
	}

	public WebElement getCountryTextBox() {
		return countryTextBox;
	}

	public WebElement getNumberOfEmployeesTextBox() {
		return NumberOfEmployeesTextBox;
	}

	public WebElement getAnnualRevenueTextBox() {
		return AnnualRevenueTextBox;
	}

	public WebElement getIndustrylistBox() {
		return industrylistBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getLeadAccountnameText() {
		return leadAccountnameText;
	}


}
