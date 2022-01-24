package cucumbermap;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;

public class Hokable
{
 @Before
      public void before (Scenario scenario) throws Throwable 
      {
	    HTMLReportGenerator.TestSuiteStart("D:\\Eveningbatch1\\flipkart.html", "FlipkartProject");
	    HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	 
	 System.out.println("----------------------------Scenario start--------------------------------------------------------");
	 
      }
	
	
	
	
	@After
	
	   public void after(Scenario scenario)
	   {
		
		System.out.println("----------------------------Scenario end-------------------------------------------------------");
	    HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		}
	
	
	
}
