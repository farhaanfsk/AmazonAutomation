package com.epam.AmazonPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends Page {
    @FindBy(id = "twotabsearchtextbox")
	private WebElement bookSearch;
    @FindBy(id = "nav-input")
	private WebElement search;
	public BooksPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void search(String searchkey) {
		bookSearch.sendKeys("searchkey");
		search.click();
	}

}
