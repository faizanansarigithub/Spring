package com.fa.bean;

public class BeanTest {
	private int a;
	private int b;
	
	private BeanTest(int a, int b) {
	System.out.println("BeanTest :: Two param constructor");
		this.a = a;
		this.b = b;
	}
	private BeanTest() {
		System.out.println("BeamTest::: 0 param constructor");
	}
	
	@Override
	public String toString() {
		return "BeanTest [a=" + a + ", b=" + b + "]";
	}
	
	
}
