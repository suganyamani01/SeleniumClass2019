package com.leafBot.testcases;

import org.testng.annotations.Test;

import com.leafBot.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{
	@Test(dataProvider="fetchData") 
	public void CreateLead() {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		
		
	}
}
