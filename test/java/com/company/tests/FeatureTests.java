package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.company.pages.BasePage;
import com.company.pages.DeleteEmail;
import com.company.pages.NavigatePage;



public class FeatureTests {

	private WebDriver _driver;
	/*
		Call to the page classes in the page object model and set them to a variable
	*/
	BasePage Base;
	DeleteEmail Login;
	NavigatePage Nav;
	WebDriverWait Wait;

	// We take url from testng file parameter name="url" value="https://mail.google.com"
	@BeforeClass()
	public void start(){
		System.out.println("Deleting stuf");
		_driver = com.company.pages.BasePage.GetGCDriver();
		Base = new com.company.pages.BasePage();
		Nav = new com.company.pages.NavigatePage();
		Login = new com.company.pages.DeleteEmail(_driver);
		Nav.NavToBase("");
		Login.loginToYahoo("", "");

	}

	@AfterClass()
	public void endClassFF() {
		_driver.close();
		_driver.quit();
		System.out.println("Gonna stop deleting stuf");
		System.out.println("================================================================");
	}
	@Test(invocationCount = 2)
	public void simpleTestLogInToGmail() throws Exception {
		Login.deleteYahooEmail();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-action='ok']")));
		_driver.findElement(By.cssSelector("button[data-action='ok']")).click();

	}


}