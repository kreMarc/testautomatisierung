package com.basys.automatedtesting.officeafternoon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */
public class BaseSeleniumTest {

	protected WebDriver driver = null;

	@BeforeEach
	public void start() {
		System.setProperty("webdriver.gecko.driver", "C:\\Entwicklung\\eclipse\\webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.de");
	}

	@AfterEach
	public void beenden() {
		driver.quit();
	}

}
