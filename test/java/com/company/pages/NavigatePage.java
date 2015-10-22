package com.company.pages;

public class NavigatePage extends BasePage{


	public NavigatePage() {
		_baseUrl = "https://mail.yahoo.com";
	}

	public void NavToBase(String url) {
		String navigateToThisUrl = _baseUrl + url;
		driver.navigate().to(navigateToThisUrl);
	}
}
