package com.ManiGopiReddy.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataProperties {
	String email;
	String email1;
	String url;
	String password;
	String password1;
	 
	public DataProperties() {
		data();
	}
	public void data() {
		File file = new File("C:\\com.ManiGopiReddy.TechAssessment3\\com.ManiGopiReddy.TechAssessment3\\src\\test\\resources\\data.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
	}
		url =prop.getProperty("url");
		email =prop.getProperty("email");
		email1= prop.getProperty("email1");
		password=prop.getProperty("password");
		password1=prop.getProperty("password1");
	 
	}

}
