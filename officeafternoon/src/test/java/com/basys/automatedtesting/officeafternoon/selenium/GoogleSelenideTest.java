package com.basys.automatedtesting.officeafternoon.selenium;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import org.junit.jupiter.api.Test;

import com.basys.automatedtesting.officeafternoon.BaseSelenideTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

/**
 * 
 * @author marce
 *
 */
public class GoogleSelenideTest extends BaseSelenideTest {

	@Test
	public void OA_T1_testGoogle() {
		
		
		// accept popup
		driver.findElement(By.xpath("//*[@id='L2AGLb']")).click();

		Thread.sleep(2000);

		WebElement sucheInput = driver.findElement(By.xpath("//input[@title = 'Suche']"));
		sucheInput.sendKeys("develop group");

		Thread.sleep(2000);

		WebElement ersterEintragHeading = driver.findElement(By.xpath(
				"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span"));

		Thread.sleep(2000);

		String text = ersterEintragHeading.getText();
		assertEquals("develop group Holding AG", text);

	}

}
