package com.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DeleteEmail extends BasePage{

	@FindBy(id = "login-username")
	WebElement loginName;

	@FindBy(id = "login-passwd")
	WebElement password;

	@FindBy(id = "login-signin")
	WebElement loginButton;

	@FindBy(css = "input[class='focusable neoFocusable enabled']")
	WebElement clickCheck;

	@FindBy(css = "button[data-action='delete']")
	WebElement delete;

//	@FindBy(css = "button[data-action='ok']")
//	WebElement deleteConfirm;

	public DeleteEmail(WebDriver driver){
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String strUserName) {
		loginName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}



	public void clickLogin() {
		loginButton.click();
	}

	public void selectCheck(){
		clickCheck.click();
	}

	public void delete(){
		delete.click();
	}

//	public void deleteConfirm(){
//		deleteConfirm.click();
//	}


	public void loginToYahoo(String strUserName, String strPassword) {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();


	}
	public void deleteYahooEmail() throws Exception{
		this.selectCheck();
		this.delete();
	}

//	public void confirmDeleteEmail() throws Exception{
//		Thread.sleep(1000);
//		deleteConfirm();
//	}





}
