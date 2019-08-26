package com.Selenium;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	@Test(timeOut = 5000)
	public void infinteLoopTest() throws InterruptedException{
		Thread.sleep(4000);
		int i= 1;
		while(i==1){
			System.out.println(i);
		}
	}

}
