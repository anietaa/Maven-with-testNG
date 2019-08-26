package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2 {
@Test
	public void enterDataInTextField() throws InterruptedException{
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\CompleteEclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.oyorooms.com/");
	driver.findElement(By.xpath("//*[@id='autoComplete__home']")).sendKeys("Block");;
    driver.findElement(By.xpath("/html//input[@id='autoComplete__home']"));
		
	}

}
 