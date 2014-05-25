package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seltest.core.PageObject;

public class SignOnPage extends PageObject {
	
	private final String USERNAME="admin";
	private final String PASSWORD ="admin";

	@FindBy(name="userName")
	private WebElement txtUserName;
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement imgLogin;
	
	public SignOnPage(WebDriver driver) {
		super(driver);
	}
	
	public FlightFinderPage defaultLogin(){
		setUserName(USERNAME);
		setPassword(PASSWORD);
		clickLogin();
		return PageFactory.initElements(driver, FlightFinderPage.class);
	}

	public String getUserName() {
		return STEP.getText(txtUserName);
	}

	public void setUserName(String val) {
		STEP.sendKeys(txtUserName, val);
	}

	public String getPassword() {
		return STEP.getText(txtPassword);
	}

	public void setPassword(String val) {
		STEP.sendKeys(txtPassword,val);
	}

	public void clickLogin() {
		STEP.click(imgLogin);;
	}

}
