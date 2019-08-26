package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example9 {
	
	@Test
	public void enterText() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		System.setProperty("www.chromedriver.com","C:\\CompleteEclipse\\eclipse\\chromedriver.exe" );
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupA");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
