package com.fa.beans;

public class Student {
	private int sno;
	private String sname;
	private String saddrs;
	private float fee;
	//constructor injection
	public Student(int sno, String sname, String saddrs, float fee) {
		System.out.println(" Student:: 4 param constructor ");
		this.sno = sno;
		this.sname = sname;
		this.saddrs = saddrs;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", fee=" + fee + "]";
	}
	
}
