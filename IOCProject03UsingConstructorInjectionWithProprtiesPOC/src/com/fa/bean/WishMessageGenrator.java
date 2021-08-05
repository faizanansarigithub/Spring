package com.fa.bean;

import java.util.Date;

public class WishMessageGenrator {
	private Date date;
	
	
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public WishMessageGenrator(Date date) {
		this.date=date;
	}
	public String wishMessage(String user) { 
		System.out.println("WishMessageGenrator.wishMessage()"+date);
		int hour=date.getHours();
		if(hour<12)
			return "Good Moorning   "+user;
		else if(hour<16)
			return "Goot Afternoon    "+user;
		else if(hour<20)
			return "Good Evening    "+user;
		else
			return "Good Night   "+user;
	}
}
