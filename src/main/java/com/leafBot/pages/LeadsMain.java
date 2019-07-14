package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class LeadsMain extends Annotations {
	public LeadsMain() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	WebElement CreateLeadLink;

	public CreateLead ClickCreateLeadLink() {
		click(CreateLeadLink);
		return new CreateLead();

	}
}
