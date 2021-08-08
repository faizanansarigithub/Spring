package com.fa.comps;

public class DTDC implements Courier {

	@Override
	public String delevery(int oid) {
		return "Your Product Delevered by DTDC Services Order ID is :: "+oid;
	}

}
