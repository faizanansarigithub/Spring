package com.fa.beans;

public class Bike {
	private String engineNo;
	private String bikeNo;
	private String color;
	private String owner;
	private String type;
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Bike [engineNo=" + engineNo + ", bikeNo=" + bikeNo + ", color=" + color + ", owner=" + owner + ", type="
				+ type + "]";
	}
	
}
