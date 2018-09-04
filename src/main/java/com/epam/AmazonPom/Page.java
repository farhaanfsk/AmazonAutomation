package com.epam.AmazonPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Farhaan_Shaik
 *
 */
public class Page {
    private WebDriver driver;
    private Actions actions;
    public Page(WebDriver driver) {
    	this.driver = driver;
    }
	public Actions getActions() {
		return actions;
	}
}

