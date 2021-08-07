package com.fa.comp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	
		public void setCourier(Courier courier) {
		this.courier = courier;
	}

		public String shoping(String[] items,float[] price) {
			float billAmt=0.0f;
			int oid=0;
			String msg=null;
			for(float p:price)
				billAmt+=p;
			//generate Random id
			oid=new Random().nextInt(10000);
			//use Courier Services
			msg=courier.deliver(oid);
			return Arrays.toString(items)+"Are Purchased Having prices "+Arrays.toString(price)+" With Total Bill Amount is "+billAmt+"-------"+msg;
		}
}
