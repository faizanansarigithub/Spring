package com.fa.test;

import com.fa.basic.PrinterThreeD;

public class Test {

	public static void main(String[] args) {
		PrinterThreeD p1=null,p2=null;
		p1=PrinterThreeD.getInstance();
		p2=PrinterThreeD.getInstance();
		
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
		System.out.println(p1==p2);
		p1.message("First pase is Printed");
	}

}
