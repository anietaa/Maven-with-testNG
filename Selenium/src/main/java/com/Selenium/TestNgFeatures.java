package com.Selenium;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest(){
		System.out.println("login test");
		//int i =9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePgaeTest(){
		System.out.println("Home Page Test");
		
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest(){
		System.out.println("Search Page Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void regPageTest(){
		System.out.println("Reg Page Test");
	}

}
