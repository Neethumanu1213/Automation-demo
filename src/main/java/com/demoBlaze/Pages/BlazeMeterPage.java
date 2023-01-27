package com.demoBlaze.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.Base.TestBase;

public class BlazeMeterPage extends TestBase {

	public BlazeMeterPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".sectionbanner>a:first-of-type")
	WebElement gettingStartedBtn;
	
	public String getTitleOfThePage() {
		return driver.getTitle();
		
	}
	public GettingStartedBlazeMeterPage clickOnGetingStartedButton() {
		gettingStartedBtn.click();
		return new GettingStartedBlazeMeterPage();
		
	}
}
