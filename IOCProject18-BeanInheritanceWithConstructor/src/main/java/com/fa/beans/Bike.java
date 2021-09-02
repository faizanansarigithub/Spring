package com.fa.beans;

public class Bike {
	private String engineNo;
	private String bikeNo;
	private String color;
	private String owner;
	private String type;
	
	
	public Bike(String engineNo, String bikeNo, String color, String owner, String type) {
		
		this.engineNo = engineNo;
		this.bikeNo = bikeNo;
		this.color = color;
		this.owner = owner;
		this.type = type;
	}


	@Override
	public String toString() {
		return "Bike [engineNo=" + engineNo + ", bikeNo=" + bikeNo + ", color=" + color + ", owner=" + owner + ", type="
				+ type + "]";
	}
	
}
