package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations{
public MyHomePage() {
	PageFactory.initElements(driver, this);
}
@FindBy(how=How.LINK_TEXT, using="CRM/SFA") 
WebElement eleCRMLink;
public CreateLead clickCRMLink()
{
	return new CreateLead();
	
}
}
