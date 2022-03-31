package com.basys.automatedtesting.officeafternoon.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basys.automatedtesting.officeafternoon.BaseSeleniumTest;

/**
 * 
 * @author marcel
 *
 */
public class GoogleSeleniumTest extends BaseSeleniumTest {

	@Test
	public void testGoogle() throws InterruptedException {

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
