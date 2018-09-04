/**
 * 
 */
package com.epam.AmazonPom;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

/**
 * @author Farhaan
 *
 */
public class PageTest extends TestCase {

	@BeforeClass
	protected void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farhaan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		HomePage homepage = new HomePage(driver);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
