package com.fa.basic;

public class PrinterThreeD {
	private static PrinterThreeD INSTANCE;
	private PrinterThreeD() {
		//No Body Here
	}
	public static PrinterThreeD getInstance() {
		if(INSTANCE==null)
			INSTANCE=new PrinterThreeD();
		return INSTANCE;
	}
	public static void message(String msg) {
		System.out.println("Your Printer Message is :: "+msg);
	}
}
