package com.fa.comp;

public final class BlueDarkCourier implements Courier {

	@Override
	public String deliver(int oid) {
	
		return "BlueDark Courier Deliver Order id ::: "+oid+"  Order Product";
	}

}
