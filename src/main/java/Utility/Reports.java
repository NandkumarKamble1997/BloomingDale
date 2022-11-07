package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public void addReports() {
		
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("extentReport.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Createdby", "Nandkumar");
		reports.setSystemInfo("Type", "Regression Testing");
		
	}

}
