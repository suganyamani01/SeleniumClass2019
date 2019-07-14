package com.leafBot.pages;

import java.text.Annotation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.leafBot.testng.api.base.Annotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

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
	public CreateLead TypeCompanyName(String cname) {
		clearAndType(eleCompanyName, cname);
		return this;
	}
	@Given ("Type First Name")
	public CreateLead TypeFirstName(String fname) {
		clearAndType(eleFirstName, fname);
		return this;
	}
	@Given ("Type Last Name")
	public CreateLead TypeLastName(String lname) {
		clearAndType(eleLastName, lname);
		return this;
	}
	@When ("I click on create Lead button")
	public ViewLead clickSubmitBtn() {
		click(eleSubmitbtn);
		return new ViewLead();
	}
}
