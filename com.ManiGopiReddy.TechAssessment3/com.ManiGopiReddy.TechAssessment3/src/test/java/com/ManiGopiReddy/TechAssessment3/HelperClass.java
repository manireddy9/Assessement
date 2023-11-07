package com.ManiGopiReddy.TechAssessment3;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
		private static  HelperClass helperClass;
		private static WebDriver driver;
		public static Logger log;
		public static WebDriverWait wait;
		
		public final static int TIMEOUT = 40;
		HelperClass() {
			log = LogManager.getLogger(RegisterStepDefinition.class);
			driver= new EdgeDriver();
			wait=new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
		}
		public static void openPage(String url) {
			driver.get(url);
		}
		public static  WebDriver getDriver() {
			return driver;
		}
		public static void SetUpDriver() {
			if(helperClass==null) {
				helperClass=new HelperClass();
			}
		}
		public static void TearDown() {
			if(driver!=null) {
				driver.close();
				driver.quit();
				log.info("Quting the driver");
			}
			helperClass = null;
		}
	}
	
	