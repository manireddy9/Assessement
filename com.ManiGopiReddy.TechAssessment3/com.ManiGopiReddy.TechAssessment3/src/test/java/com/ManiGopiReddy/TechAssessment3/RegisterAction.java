package com.ManiGopiReddy.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class RegisterAction {
	
		RegisterLocators objregister=null;
		public RegisterAction() {
			objregister=new RegisterLocators();
			PageFactory.initElements(HelperClass.getDriver(), objregister);
		}
		public void RegisterClick() {
			
			objregister.registerlink.click();
		}
		public void Setgender(String gender) {
		  if(gender.equalsIgnoreCase("male")) {
			  objregister.genderMale.click();
		  }
		  else {
			  objregister.genderFemale.click();
		  }
		}
		public void SetFirstname(String fname) {
			 objregister.firstname.sendKeys(fname);
		 }
		 public void SetLastname(String lname) {
			 objregister.lastname.sendKeys(lname);
		 }
		 public void SetEmail(String mail) {
			 objregister.email.sendKeys(mail);
		 }
		 public void SetPassword(String pass) {
			 objregister.password.sendKeys(pass);
		 }
		 public void SetConfirm(String cpass) {
			 objregister.Confirmpassword.sendKeys(cpass);
		 }
		 public void register() {
			 objregister.register.click();
		 }
		 public String check() {
			 return objregister.verify.getText();
		 }
		 public void logout1(){
			 objregister.logout.click();
		 }
		public void registration(String gender,String fname,String lname,String mail,String pass,String cpass) {
		   
			Setgender(gender);
			SetFirstname(fname);
			SetLastname(lname);
			SetEmail(mail);
			SetPassword(pass);
			SetConfirm(cpass);
		}
		}

