package com.basys.automatedtesting.officeafternoon;

import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

public class BaseSelenideTest {

	@BeforeEach
	public void start() {

		System.setProperty("webdriver.gecko.driver", "C:\\Entwicklung\\eclipse\\webdrivers\\geckodriver.exe");
		Configuration.browser = "FIREFOX";

//		Configuration.timeout = 10000;
//		Configuration.pollingInterval = 300;
		open("https://www.google.de");
		WebDriverRunner.getWebDriver().manage().window().maximize();

	}

	@AfterEach
	public void quit() {
		WebDriverRunner.closeWebDriver();
	}

}
