package com.demoBlaze.Utils;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.demoBlaze.Base.TestBase;

public class RetryFailedTest extends TestBase implements IRetryAnalyzer {
	Logger log = Log.getLoggerData(this.getClass().getName());

	int testRunCounter = 0;
	int maxCounter = 2;

	@Override
	public boolean retry(ITestResult result) {
		if (testRunCounter > maxCounter) {
			testRunCounter++;
			log.info("Running a failed test " + testRunCounter + " times");
		}
		return true;
	}

}
