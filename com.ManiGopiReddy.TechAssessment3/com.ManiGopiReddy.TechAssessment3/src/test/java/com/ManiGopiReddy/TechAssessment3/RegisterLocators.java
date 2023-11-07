package com.ManiGopiReddy.TechAssessment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerlink;
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement genderMale;
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement genderFemale;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement Confirmpassword;
	@FindBy(xpath="//input[@id='register-button']")
	WebElement register;
	@FindBy(xpath="//h1[text()='Register']")
	WebElement verify;
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logout;
	
	
}
