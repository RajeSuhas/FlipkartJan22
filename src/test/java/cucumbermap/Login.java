package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.Seleniumops;
import utility.HTMLReportGenerator;

public class Login 
{

	@Given ("^user opens \"(.*)\" browser with exe$")
	public void user_opens_browser_with_exe(String string )  throws Throwable
	{
		Object[] input=new Object[1];
    input[0]=string;   
    Seleniumops.browserLaunch(input);
	    
	}

	@Given ("^user enters url as$") 
	public void user_enters_url_as() throws Throwable
	{
		
    Seleniumops.openApplication();
	   
	}

	@When("click on Cancel button")
	public void click_on_cancel_button() throws Throwable
	{
		Object[] input2=new Object[1];
    input2[0]="//*[@class='_2KpZ6l _2doB4z']";
    Seleniumops.clickonElement(input2);
	    
	}

	@When("user move on Login Dropdown")
	public void user_move_on_login_dropdown() throws Throwable
	{
		Object[] input3=new Object[1];
    input3[0]="//*[@class='_1_3w1N']";
    Seleniumops.moveOnElement(input3);
	    
	}

	@When("user click on My Profile")
	public void user_click_on_my_profile()   throws Throwable
	{
		Object[] input4=new Object[1];
    input4[0]="//*[@class='_3vhnxf'][1]";
    Hashtable<String, Object> output4 = Seleniumops.clickonElement(input4);
    HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user click on My Profile", output4.get("MESSAGE").toString());
	   
	}


	@When ("^user enter (.+) as username$")
	public void user_enter_as_username(String string) throws Throwable
	{
		Object[] input5=new Object[2];
        input5[0]="(//*[@type='text'])[2]";            
        input5[1]="9028302520";
        Hashtable<String, Object> output5 = Seleniumops.Sendkeys(input5); 
        HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"user enter {string} as username" ,output5.get("MESSAGE").toString());
	}

	@When ("^user enter (.+) as password$")
	public void user_enter_as_password(String string)  throws Throwable
	{
		Object[] input6=new Object[2];
        input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	    input6[1]="DN7140solapur";
	    Hashtable<String, Object> output6 = Seleniumops.Sendkeys(input6);
	    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"user enter {string} as password" ,output6.get("MESSAGE").toString());
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws Throwable
	{
		Object[] input7=new Object[1];
        input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
        Hashtable<String, Object> output7 = Seleniumops.clickonElement(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user click on login button" ,output7.get("MESSAGE").toString());
	}

	@Then("Application shows user profile to user")
	public void application_shows_user_profile_to_user() throws Throwable
	{
		Object[] input8=new Object[2];
        input8[0]="Suhas Raje";
        input8[1]="//*[text()='Suhas Raje']";
        Hashtable<String, Object> output8 = Seleniumops.ValidationLogin(input8); 
        HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"Application shows user profile to user",output8.get("MESSAGE").toString());
	       
	}
	
}
