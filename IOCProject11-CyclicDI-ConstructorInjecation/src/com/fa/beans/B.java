package com.fa.beans;

public class B {
	private A a;
	public B() {
		System.out.println("0 param constructor");
	}
	public B(A a) {
		System.out.println("B 1 param constructor)");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
}
