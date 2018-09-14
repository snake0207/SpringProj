package com.acro.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strClassPath = System.getProperty("java.class.path");
		System.out.println("path = " + strClassPath);
		
		String cfg = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(cfg);
		MyCalcClass myCalc = ctx.getBean("MyCalc", MyCalcClass.class);
		
		myCalc.add();
		myCalc.sub();
	}

}
