package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class CRMHomePage extends Annotations {
	public CRMHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-panel-header'])[2]/a")
	WebElement LinktoLeadstab;


	public LeadsMain clickLeadsTab() {
		click(LinktoLeadstab);
		return new LeadsMain();
	}
}
