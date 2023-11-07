package com.ManiGopiReddy.TechAssessment3;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	RegisterAction objregaction=new RegisterAction();
	
	@Given("user must be in registration page")
	public void user_must_be_in_registration_page() throws InterruptedException {
	   HelperClass.openPage("https://demowebshop.tricentis.com/");
	   HelperClass.log.info("WebSite is Opened");
	  
	   	}
	@When("user clicks the registration link")
	public void user_clicks_the_registration_link() {
	    objregaction.RegisterClick();
	}
	@When("user enter the required details")
	public void user_enter_the_required_details(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
		    for(Map<String,String> data : signUpForm) {
		    	String gender = data.get("gender");
		    	String firstname = data.get("FirstName");
		    	String lastname = data.get("LastName");
		    	String email = data.get("Email");
		    	String password = data.get("password");
		    	String cpassword = data.get("confirm");
		    	objregaction.registration(gender,firstname, lastname, email, password, cpassword);
		    }
		    	 
		  	}
		       
	@Then("click the register to navigate to HomePage.")
	public void click_the_register_to_navigate_to_home_page() {
	   objregaction.register();
	  
	    HelperClass.log.info("User clicks register button");
	}

	@Then("verify the user landed in correct page or not")
	public void verify_the_user_landed_in_correct_page_or_not() {
		 Assert.assertTrue(objregaction.check().contains("Register"));
		objregaction.logout1();
	}


}
