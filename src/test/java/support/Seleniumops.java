package support;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import cucumbermap.ConfigReader;

public class Seleniumops
{

	public static WebDriver driver=null;
	public static ConfigReader config=null;
	
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	//browserLaunch
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
	{
		try {
		String strBrowserName=(String)inputParameters[0];
		
		
		config=new ConfigReader();
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		else if (strBrowserName.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", config.getDriverPathFF());
			driver=new OperaDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data:" + config.getDriverPathChrome().toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data:" + config.getDriverPathChrome().toString());	
		}
	     return outputParameters;
		}
	 //openapplication
	public static Hashtable<String,Object> openApplication() 
	{
		try {
		
		driver.get(config.getApplicationUrl());
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data:" + config.getApplicationUrl().toString());
			
	}
	catch(Exception e)
	{outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data:" + config.getApplicationUrl().toString());
			
	}
     return outputParameters;
	}
			
	//clickonElement
	public static Hashtable<String,Object> clickonElement(Object[]inputParameters)
	{
		try {
		String cliq=(String) inputParameters[0];
		driver.findElement(By.xpath(cliq)).click();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickonElement, Input_Data:" + inputParameters[0].toString());
	     }
		catch(Exception e)
		{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed:clickonElement, Input_Data:" + inputParameters[0].toString());
		
	}
     return outputParameters;
	}
	  //moveonelement
	public static Hashtable<String,Object> moveOnElement(Object[] inputParameters) throws Throwable
	{
		try {		
		Actions act=new Actions(driver);
		String move2= (String) inputParameters[0];
		WebElement moveon=driver.findElement(By.xpath(move2));
		act.moveToElement(moveon).build().perform();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:moveOnElement, Input_Data:" + inputParameters[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:moveOnElement, Input_Data:" + inputParameters[0].toString());	
		}
	     return outputParameters;
		}
	  //sendkeys
	public static Hashtable<String,Object> Sendkeys(Object[] inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		WebElement sk=driver.findElement(By.xpath(xpath));
		           sk.sendKeys(value);
		   		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);

		    outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:Sendkeys, Input_Data:" + inputParameters[1].toString());	        
	}catch(Exception e)
		{
		 outputParameters.put("STATUS", "FAIL");
		 outputParameters.put("MESSAGE", "methodUsed:Sendkeys, Input_Data:" + inputParameters[1].toString());
	}
     return outputParameters;
	}
	
	public static Hashtable<String,Object> ValidationLogin(Object[] inputParameters) throws Throwable
	{ try {
		String givenText=(String) inputParameters[0];              //Suhas Raje
		String xpath =(String)  inputParameters[1];                //xpath of above text
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	
		String text=driver.findElement(By.xpath(xpath)).getText();
		 outputParameters.put("STATUS", "PASS");
		 outputParameters.put("MESSAGE", "methodUsed:ValidationLogin, Input_Data:" + inputParameters[0].toString());
		     
		      if (givenText.equalsIgnoreCase(text))
		  {
			  System.out.println("Test Case Passed");
		  }
		  else
		  {
			  System.out.println("Test Case Failed");
		  }
		         
	}catch(Exception e)
	{
		 outputParameters.put("STATUS", "FAIL");
		 outputParameters.put("MESSAGE", "methodUsed:ValidationLogin, Input_Data:" + inputParameters[0].toString());
	
	}
     return outputParameters;
	}
	
}

