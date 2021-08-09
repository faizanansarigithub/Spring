package com.fa.comps;

public class Employee {
	private int empNo;
	private String empName;
	private String addrs;
	private float empSalary;


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}


	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", addrs=" + addrs + ", empSalary=" + empSalary
				+ "]";
	}
	
}
