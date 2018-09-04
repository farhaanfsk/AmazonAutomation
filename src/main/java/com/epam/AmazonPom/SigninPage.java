package com.epam.AmazonPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends Page {
	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	@FindBy(id = "ap_password")
	private WebElement pwd;
	
	@FindBy(id = "signInSubmit")
	private WebElement signInSubmit;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void  setEmail(String email) {
		this.email.sendKeys(email);
	}
	public void clickContinue() {
		continueButton.click();
	}

	public void setPwd(String pwd) {
		this.pwd.sendKeys(pwd);
	}

	public void setSignInSubmit(WebElement signInSubmit) {
		signInSubmit.click();
	}
	

}
