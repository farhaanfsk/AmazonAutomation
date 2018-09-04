package com.epam.AmazonPom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Farhaan_Shaik
 *
 */
public class HomePage extends Page {
	WebDriver driver;
	@FindBy(id = "nav-link-yourAccount")
	private WebElement signIn;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public SigninPage clickSignIn() {
		signIn.click();
		return new SigninPage(driver);
	}

}
