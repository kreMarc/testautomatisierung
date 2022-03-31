package com.basys.automatedtesting.officeafternoon.selenide;

import static org.junit.Assert.assertEquals;

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

		/**
		 * Step 1 - Accecpt popup
		 */
		// Accept popup
		$(byId("L2AGLb")).click();

		/**
		 * Step 2 - Set Value in search input field
		 */
		SelenideElement sucheInput = $(byTitle("Suche"));
		sucheInput.setValue("develop group");

		SelenideElement ersterEintrag = $(byXpath(
				"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span"));

		ersterEintrag.shouldBe(Condition.exist);
		ersterEintrag.shouldBe(Condition.text("develop group Holding AG"));

		/**
		 * Step 3 - Select first entry of dropdown
		 */
		ersterEintrag.click();
		$(byXpath("//div[@class = 'hdtb-mitem hdtb-msel']")).shouldBe(Condition.text("Alle"));

	}

}
