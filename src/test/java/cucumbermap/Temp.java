package cucumbermap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp
{
	
		   public static void main(String[] args) 
		   {
			  System.setProperty("webdriver.chrome.driver", "D:\\Automation soft support\\chromedriver.exe");
			  
			  ChromeDriver driver =new ChromeDriver();
			  
			 // open website
			   driver.get("https://www.flipkart.com/");
			  driver.manage().window().maximize();
			  
			  //wait
			  driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
			  
			  //click on cancel
			  driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
			  
			  //mouseoperation
			  Actions act=new Actions(driver);
			 WebElement login= driver.findElementByXPath("//*[@class='_1_3w1N']");
			  act.moveToElement(login).build().perform(); 
			  
			  //click on myprofile
			  Actions act2 =new Actions(driver);
			  WebElement profile= driver.findElementByXPath("//*[@class='_3vhnxf'][1]"); 
			  		act.moveToElement(profile).build().perform();
			  		profile.click();
			  		
			  	//enter username and password login
			  		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9028302520");
			  		                         ////*[@class='_2IX_2- VJZDxU'
			  		
			  		driver.findElementByXPath("//*[@type='password']").sendKeys("Rsuhas5889");
			  		
			  		
			  		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
			  
		   }
			
			
		}


