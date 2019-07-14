package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class HomePage extends Annotations{ 

	public HomePage() {
       PageFactory.initElements(driver, this);
	} 
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") 
	WebElement eleLogout;
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") 
	WebElement eleCRMLink;
	public CRMHomePage clickCRMLink()
	{
		click(eleCRMLink);
		return new CRMHomePage();
		
	}
	public LoginPage clickLogout() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit"); Already located using page factory
		click(eleLogout);  
		return new LoginPage();
	}

}







