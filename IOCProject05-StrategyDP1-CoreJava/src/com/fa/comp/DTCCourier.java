package com.fa.comp;

public final class DTCCourier implements Courier {

	@Override
	public String deliver(int oid) {
	
		return "DTC Courier Deliver Order id ::: "+oid+"  Order Product";
	}

}
