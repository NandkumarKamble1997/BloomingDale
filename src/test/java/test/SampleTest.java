package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import Utility.BaseClass;
@Listeners(Utility.Listener.class)
public class SampleTest extends BaseClass {
	
	ExtentReports reports;
	//ExtentTest test;
	
	@BeforeMethod
	public void launchBrowser() 
	{
		driver = Browser.openBrowser();
	}
	
	@Test (timeOut= 1000)
	public void test3() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("test 1 executed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 executed");
	}

}
