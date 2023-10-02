package com.saucedemo.testlayer;

import org.testng.annotations.Test;

import com.saucedemo.pagelayer.LoginPage;
import com.saucedemo.testbase.TestBase;

public class LoginTest extends TestBase 
{
	@Test
	public void loginTestWithValidCredential()
	{
	LoginPage login_obj = new LoginPage(driver);
	login_obj.enterUserName("standard_user");
	login_obj.enterPassword("secret_sauce");
	login_obj.clickOnLoginButton();
	
	}
	
}
