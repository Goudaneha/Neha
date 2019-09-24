package com.testng.mav;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider="dp")
	public void fun1(Integer n,String s) {
		System.out.println("Int :"+ n + "str: "+ s);
	}
	@BeforeMethod
	public void test1() {
		System.out.println("Data provider");
	}
	
	@DataProvider public Object[][] dp(){
		return new Object[][]
				{
			new Object[] {1,"as"},
			new Object[] {2,"ac"},};
	}
}
