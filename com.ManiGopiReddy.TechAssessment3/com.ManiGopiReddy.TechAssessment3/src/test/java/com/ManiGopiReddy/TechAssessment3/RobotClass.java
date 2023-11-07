package com.ManiGopiReddy.TechAssessment3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://pdf2doc.com/");
		WebElement file=driver.findElement(By.xpath("//label[@class='button files__button files__button_mr']"));
		file.click();
		Robot rb= new Robot();
		StringSelection str=new StringSelection("file:///C:/Users/mchalla/Downloads/TX%20-%2003.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
