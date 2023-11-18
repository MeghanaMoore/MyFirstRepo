package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	

	
		public RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		@FindBy(linkText="Register")
		private WebElement registerLink;
		
		@FindBy(id="gender-female")
		private WebElement genderButton;

		
		@FindBy(id="FirstName")
		private WebElement firstName;

		
		@FindBy(id="LastName")
		private WebElement lastName;

		
		@FindBy(id="Email")
		private WebElement email;

		
		@FindBy(id="Password")
		private WebElement pass;

		
		@FindBy(id="Confirm Password")
		private WebElement cpass;
		
		
		@FindBy(id="register-button")
		private WebElement regButton;


		public WebElement getRegisterLink() {
			return registerLink;
		}


		public WebElement getgenderButton() {
			return genderButton;
		}


		public WebElement getfirstName() {
			return firstName;
		}


		public WebElement getlastName() {
			return lastName;
		}


		public WebElement getemail() {
			return email;
		}


		public WebElement getpass() {
			return pass;
		}


		public WebElement getcpass() {
			return cpass;
		}


		public WebElement getregButton() {
			return regButton;
		}


	}

