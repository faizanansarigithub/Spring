package com.fa.bean;

import java.util.Date;
import java.util.List;

public class College {
	private List<String> studentName;
	private List<Date> dateList;
	
	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}
	
	@Override
	public String toString() {
		return "College [studentName=" + studentName + ", dateList=" + dateList + "]";
	}
		
}
