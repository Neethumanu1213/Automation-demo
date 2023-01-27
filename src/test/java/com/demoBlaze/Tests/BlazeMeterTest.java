package com.demoBlaze.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoBlaze.Base.TestBase;
import com.demoBlaze.Pages.BlazeMeterPage;

public class BlazeMeterTest extends TestBase {
	
	@BeforeMethod
	public void setUp() {

		browserLaunch();
	}

	@Test
	public void validateTheTitleOfThePage() {
	BlazeMeterPage blazeMeterPage=new BlazeMeterPage();
	String title= blazeMeterPage.getTitleOfThePage();
	Assert.assertEquals(title,"BlazeMeter","Title is not matching");

	}

	@AfterMethod
	public void tearDown() {

		quitBrowser();
	}

}
