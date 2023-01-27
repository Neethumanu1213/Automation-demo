package com.demoBlaze.Pages;

import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.Base.TestBase;

public class GettingStartedBlazeMeterPage extends TestBase {

	public GettingStartedBlazeMeterPage() {
		PageFactory.initElements(driver, this);

	}
	
	public String getTitleOfThePage() {
		return driver.getTitle();
		
	}

}
