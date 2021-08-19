package com.fa.beans;

public class A {
  private B b;

	public A(B b) {
		System.out.println("1 param constructor called");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
  
}
