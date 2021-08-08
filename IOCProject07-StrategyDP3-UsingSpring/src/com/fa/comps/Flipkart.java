package com.fa.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shoping(String[] item,float[] price) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		//calculate total bill Amount
		for(float p:price)
			billAmt+=p;
		//generate Random id
		oid=new Random().nextInt(20000);
		msg=courier.delevery(oid);
		return "Your Purches item is "+Arrays.toString(item)+" Price is "+Arrays.toString(price)+" Total Amount is "+billAmt+"    ------>   "+msg;
	}

}
