package com.demoBlaze.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoBlaze.Base.TestBase;
import com.demoBlaze.Pages.BlazeMeterPage;
import com.demoBlaze.Pages.GettingStartedBlazeMeterPage;

public class GettingStartedBlazeMeterTest extends TestBase {

	@BeforeMethod
	public void setUp() {

		browserLaunch();
	}

	@Test
	public void validateTheTitleOfThePage() {
	BlazeMeterPage blazeMeterPage=new BlazeMeterPage();
	GettingStartedBlazeMeterPage gettingStartedBlazeMeterPage=blazeMeterPage.clickOnGetingStartedButton();
	String title= gettingStartedBlazeMeterPage.getTitleOfThePage();
	Assert.assertEquals(title,"Security check","Title is not matching");

	}

	@AfterMethod
	public void tearDown() {

		quitBrowser();
	}
}
