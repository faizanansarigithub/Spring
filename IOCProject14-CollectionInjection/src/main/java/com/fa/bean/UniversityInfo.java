package com.fa.bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
	private Map<Integer,String> facultyDetails;
	private Map<String,Date> datesInfo;
	private Properties fruits;
	
	public void setFruits(Properties fruits) {
		this.fruits = fruits;
	}
	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}
	public void setDatesInfo(Map<String, Date> datesInfo) {
		this.datesInfo = datesInfo;
	}
	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", datesInfo=" + datesInfo + ", fruits=" + fruits
				+ "]";
	}
	
}
