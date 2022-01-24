package utility;

import support.Seleniumops;

public class Trial
{
	public static void main(String[] args) throws Throwable
	{
		//browser launch
		Object[] input=new Object[2];
		         input[0]="Chrome";
		         input[1]="D:\\Automation soft support\\chromedriver.exe";
		         Seleniumops.browserLaunch(input);
	
	//open application
	 Object[] input1=new Object[1];
		       input1[0]="https://www.flipkart.com/";
		       Seleniumops.openApplication();
		         
		        
	//clickonCancel
		Object[] input2=new Object[1];
		         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		         Seleniumops.clickonElement(input2);
		         
   //moveonelement
		Object[] input3=new Object[1];
		         input3[0]="//*[@class='_1_3w1N']";
		         Seleniumops.moveOnElement(input3);
		         
	//click on my profile
		Object[] input4=new Object[1];
		         input4[0]="//*[@class='_3vhnxf'][1]";
		         Seleniumops.clickonElement(input4);
		       
		         
	//enter id (Send Key)
	   Object[] input5=new Object[2];
	            input5[0]="(//*[@type='text'])[2]";            
	            input5[1]="9028302520";
	            Seleniumops.Sendkeys(input5);
	                           
	            
	//enter password (Sendkeys)            
	   Object[] input6=new Object[2];
	            input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
			    input6[1]="Rsuhas5889";
			    Seleniumops.Sendkeys(input6);
	
	// Clickonlogin
	    Object[] input7=new Object[1];
			     input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
			     Seleniumops.clickonElement(input7);
		           
		
	
	//ValidationLogin
	   Object[] input8=new Object[2];
	            input8[0]="Suhas Raje";
	            input8[1]="//*[@text='Suhas Raje']";
	            Seleniumops.ValidationLogin(input8); 
         }	
}
