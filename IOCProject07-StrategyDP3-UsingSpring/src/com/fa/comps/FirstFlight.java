package com.fa.comps;

public final class FirstFlight implements Courier {

	@Override
	public String delevery(int oid) {
		return "Your Product Delevered by FirstFlight Services Order ID is :: "+oid;
	}
}
