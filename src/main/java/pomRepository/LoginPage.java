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

public class LoginPage {

	@FindBy(id="username")	
	private WebElement usernametextField;

	@FindBy(id="password")	
	private WebElement passwordtextField;

	@FindBy(name="rememberUn")	
	private WebElement rememberMecheckBox;

	@FindBy(id="Login")	
	private WebElement loginButton;

	@FindBy(id="smc")	
	private WebElement verficationTextField;

	@FindBy(id="save")	
	private WebElement saveButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String username, String password) throws InterruptedException{
		usernametextField.sendKeys(username);
		passwordtextField.sendKeys(password);
		rememberMecheckBox.click();
		loginButton.click();
		verficationTextField.click();
		Thread.sleep(15000);
		saveButton.click();
	}






}
