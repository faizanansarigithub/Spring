package com.fa.test;

import com.fa.comp.Flipkart;
import com.fa.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart flipkart=null;
		flipkart=FlipkartFactory.getInstance("dtc");
		System.out.println(flipkart.shoping(new String[]{"Mobile", "Laptop"},new float[]{20000,50000}));
	}

}
