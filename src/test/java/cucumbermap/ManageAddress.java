package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.Seleniumops;
import utility.HTMLReportGenerator;

public class ManageAddress 
{
	@When("user click on manage addresses")
	public void user_click_on_manage_addresses() throws Throwable
	{
		Object [] input= new Object[1];
		       input[0]= "//*[@class='NS64GK _1MZ7_i']";
	    Hashtable<String, Object> output= Seleniumops.clickonElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on manage addresses", output.get("MESSAGE").toString());
	}

	@When("user click on Add a new address")
	public void user_click_on_add_a_new_address() throws Throwable
	{ Object [] input1= new Object[1];
	            input1[0]="//*[@class='_1QhEVk']";
	      Hashtable<String, Object> output1= Seleniumops.clickonElement(input1);
	      HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"user click on Add a new address", output1.get("MESSAGE").toString());        
	            
	    
	}

	@When("user enter {string} as name")
	public void user_enter_as_name(String string) throws Throwable
	{ Object [] input2= new Object[2];
	            input2[0]="//*[@type='text'][@tabindex='1']";
	            input2[1]=string;
	            Hashtable<String, Object> output2= Seleniumops.Sendkeys(input2);
	  	      HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user enter {string} as name", output2.get("MESSAGE").toString());          
	    
	}

	@When("user enter {string} as mobile number")
	public void user_enter_as_mobile_number(String string) throws Throwable
	{
		Object [] input3= new Object[2];
        input3[0]="//*[@class='_1w3ZZo _2mFmU7'][@name='phone']";
        input3[1]=string;
        Hashtable<String, Object> output3= Seleniumops.Sendkeys(input3);
	      HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user enter {string} as mobile number", output3.get("MESSAGE").toString());  
	   
	}

	@When("user enter {string} as pincode")
	public void user_enter_as_pincode(String string) throws Throwable
	{
		Object [] input4= new Object[2];
    input4[0]="//*[@name='pincode']";
    input4[1]=string;
    Hashtable<String, Object> output4= Seleniumops.Sendkeys(input4);
      HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user enter {string} as pincode", output4.get("MESSAGE").toString());  
		
	}

	@When("user enter {string} as locality")
	public void user_enter_as_locality(String string) throws Throwable
	{
		Object [] input5= new Object[2];
	    input5[0]="//*[@tabindex='4']";
	    input5[1]=string;
	    Hashtable<String, Object> output5= Seleniumops.Sendkeys(input5);
	      HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"user enter {string} as locality", output5.get("MESSAGE").toString());    
	}

	@When("user enter {string} as address")
	public void user_enter_as_address(String string) throws Throwable
	{
		Object [] input6= new Object[2];
	    input6[0]="//*[@tabindex='5']";
	    input6[1]=string;
	    Hashtable<String, Object> output6= Seleniumops.Sendkeys(input6);
	      HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"user enter {string} as address", output6.get("MESSAGE").toString());    
	}

	@When("user select Home as address type")
	public void user_select_home_as_address_type() throws Throwable
	{
		Object [] input7= new Object[1];
	    input7[0]="//*[@class='_2Fn-Ln _3iI7Qn'][@for='HOME']";	   
	    Hashtable<String, Object> output7= Seleniumops.clickonElement(input7);
	      HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user select Home as address type", output7.get("MESSAGE").toString());     
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws Throwable
	{
		Object [] input8= new Object[1];
	    input8[0]="//*[@tabindex='10']";	   
	    Hashtable<String, Object> output8= Seleniumops.clickonElement(input8);
	      HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"user click on save button", output8.get("MESSAGE").toString());    
	}

	@Then("application shows new address added successfully")
	public void application_shows_new_address_added_successfully() throws Throwable
	{
		Object[] input9=new Object[2];
        input9[0]="ADD A NEW ADDRESS";
        input9[1]="//*[@class='_1QhEVk']";
        Hashtable<String, Object> output9 = Seleniumops.ValidationLogin(input9); 
        HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"Application shows user profile to user",output9.get("MESSAGE").toString());  
	}
}
