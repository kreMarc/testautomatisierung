package com.basys.automatedtesting.officeafternoon.pageobjects;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class GooglePO {

	private final SelenideElement popUpAccpetor;
	private final SelenideElement sucheInput;
	private final SelenideElement ersterEintrag;
	private final SelenideElement alleTab;

	public GooglePO() {
		this.popUpAccpetor = $(byId("L2AGLb"));
		this.sucheInput = $(byTitle("Suche"));
		this.ersterEintrag = $(byXpath(
				"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span"));
		this.alleTab = $(byXpath("//div[@class = 'hdtb-mitem hdtb-msel']"));
	}

	public SelenideElement getPopUpAccpetor() {
		return popUpAccpetor;
	}

	public SelenideElement getSucheInput() {
		return sucheInput;
	}

	public SelenideElement getErsterEintrag() {
		return ersterEintrag;
	}

	public SelenideElement getAlleTab() {
		return alleTab;
	}

}
