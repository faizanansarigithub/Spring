package com.fa.comp;

public class Student {
	private int sno;
	private String name;
	private String addrs;
	
	public Student(int sno, String name, String addrs) {
		System.out.println("Student 3 param constructor executed");
		this.sno = sno;
		this.name = name;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
}
