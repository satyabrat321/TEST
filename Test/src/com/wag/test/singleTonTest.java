package com.wag.test;

public class singleTonTest {
	
	private static singleTonTest s;
	
	private singleTonTest()
	{};
	
	
	static singleTonTest getInstance()
	{
		if(s==null)
		{
			s= new singleTonTest();
		}
		
		
		return s;
		
	}
	
	
	}


