package com.basys.automatedtesting.officeafternoon.selenide;

import com.basys.automatedtesting.officeafternoon.pageobjects.GooglePO;
import com.codeborne.selenide.Condition;

public class GoogleSelenideWithPOTest {

//	@Test
	public void withPOTest() {

		GooglePO googlePO = new GooglePO();

		/**
		 * Step 1 - Accecpt popup
		 */
		// Accept popup
		googlePO.getPopUpAccpetor().click();

		/**
		 * Step 2 - Set Value in search input field
		 */
		googlePO.getSucheInput().setValue("develop group");

		googlePO.getErsterEintrag().shouldBe(Condition.exist);
		googlePO.getErsterEintrag().shouldBe(Condition.text("develop group Holding AG"));

		/**
		 * Step 3 - Select first entry of dropdown
		 */
		googlePO.getErsterEintrag().click();
		googlePO.getAlleTab().shouldBe(Condition.text("Alle"));

	}

}
