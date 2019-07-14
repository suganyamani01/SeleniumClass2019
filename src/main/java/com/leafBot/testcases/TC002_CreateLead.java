package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.CRMHomePage;
import com.leafBot.pages.CreateLead;
import com.leafBot.pages.HomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Create test Lead";
		author = "Suganya";
		category = "sanity";
		excelFileName = "TC002";
	}

	@Test(dataProvider="fetchData") 
	public void CreateLead(String uName, String pwd, String cname, String fname, String lname) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMLink()
		.clickLeadsTab()
		.ClickCreateLeadLink()
		.TypeCompanyName(cname)
		.TypeFirstName(fname)
		.TypeLastName(lname)
		.clickSubmitBtn();
	
	}
}
