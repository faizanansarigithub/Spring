package com.fa.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
	private String cname;
	private String caddrs;
	private float pamt;
	private float rate;
	private float time;
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddrs() {
		return caddrs;
	}
	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	
}
