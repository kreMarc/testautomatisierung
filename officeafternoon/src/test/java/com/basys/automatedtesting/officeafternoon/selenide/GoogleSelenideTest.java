package com.basys.automatedtesting.officeafternoon.selenide;

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
