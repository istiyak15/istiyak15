package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Md istiyak
 *
 */


public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='slds-r5']")
	private WebElement dotIcon;

	@FindBy(xpath="//button[.='View All']")
	private WebElement viewAllLink;

	@FindBy(xpath="//input[@placeholder='Search apps or items...']")
	private WebElement searchAppTextField;

	@FindBy(xpath="//mark[.='Leads']")
	private WebElement leadsLink;

	public WebElement getDotIcon() {
		return dotIcon;
	}

	public WebElement getViewAllLink() {
		return viewAllLink;
	}

	public WebElement getSearchAppTextField() {
		return searchAppTextField;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getAppLauncherpopupText() {
		return AppLauncherpopupText;
	}

	@FindBy(xpath="//h2[.='App Launcher']")
	private WebElement AppLauncherpopupText;

	
	
}

