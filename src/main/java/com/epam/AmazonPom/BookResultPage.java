/**
 * 
 */
package com.epam.AmazonPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Farhaan
 *
 */
public class BookResultPage extends Page {
	@FindBy(xpath = "//span[text()='4 Stars & Up']")
    private WebElement rating;
	@FindBy(xpath = "//i[@class='a-icon a-icon-extender-expand']")
    private WebElement seeMore;
	@FindBy(xpath = "//i[@class='a-icon a-icon-extender-collapse']")
    private WebElement seeLess;
	WebDriverWait wait;  
	/**
	 * @param driver
	 */
	public BookResultPage(WebDriver driver) {
		super(driver);
		new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	public void rating4() {
		rating.click();
	}
	public void seeMore() {
		wait.until(ExpectedConditions.elementToBeClickable(seeMore)).click();
	}
	public void seeLess() {
		wait.until(ExpectedConditions.elementToBeClickable(seeLess)).click();
	}

}
