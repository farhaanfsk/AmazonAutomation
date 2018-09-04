package com.epam.AmazonPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage extends Page {
	@FindBy(id = "nav-link-shopall")
	private  WebElement shopByCategory;
	
	@FindBy(xpath = "//span[@aria-label='Books']")
	private  WebElement booksCategory;
	
	@FindBy(linkText = "All Books")
	private  WebElement allBooks;
	Actions action;
	public UserHomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	public void dropDown() {
	    action.moveToElement(shopByCategory).build().perform();
	    booksCategory.click();
	    allBooks.click();
	}

}
