package com.leafBot.pages;

import java.text.Annotation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.java.en.Given;

public class CreateLead extends Annotations{

	public CreateLead() 
	{
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how=How.ID, using="createLeadForm_companyName") 
	WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") 
	WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") 
	WebElement eleLastName;
	@FindBy(how=How.CLASS_NAME, using = "smallSubmit")
	WebElement eleSubmitbtn;
	@Given ("Type Company Name")
	public CreateLead TypeCompanyName() {
		clearAndType(eleCompanyName, "CTS");
		return this;
	}
	@Given ("Type Company Name")
	public CreateLead TypeFirstName() {
		clearAndType(eleFirstName, "Suganya");
		return this;
	}
	@Given ("Type Company Name")
	public CreateLead TypeLastName() {
		clearAndType(eleLastName, "Mani");
		return this;
	}
	public ViewLead clickSubmitBtn() {
		click(eleSubmitbtn);
		return new ViewLead();
	}
}
