package com.fa.test;

import com.fa.comp.Flipkart;
import com.fa.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart flipkart=null;
		try {
		flipkart=FlipkartFactory.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(flipkart.shoping(new String[]{"Mobile", "Laptop"},new float[]{20000,50000}));
	}

}
