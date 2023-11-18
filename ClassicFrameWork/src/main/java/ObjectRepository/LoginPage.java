package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(id="Email")
	private WebElement mailTb;
	
	@FindBy(id="Password")
	private WebElement passTb;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement loginButton;
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getMailTb() {
		return mailTb;
	}
	public WebElement getPassTb() {
		return passTb;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
