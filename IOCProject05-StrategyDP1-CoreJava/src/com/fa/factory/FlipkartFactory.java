package com.fa.factory;

import com.fa.comp.BlueDarkCourier;
import com.fa.comp.Courier;
import com.fa.comp.DTCCourier;
import com.fa.comp.Flipkart;

public class FlipkartFactory {
		public static Flipkart getInstance(String courierName) {
			Courier courier=null;
			Flipkart flipkart=null;
			//create dependency class object
			if(courierName.equalsIgnoreCase("dtc"))
				courier=new DTCCourier();
			else if(courierName.equalsIgnoreCase("bluedark"))
				courier=new BlueDarkCourier();
			else
				throw new IllegalArgumentException("Invalid Courier Name");
			flipkart=new Flipkart();
			flipkart.setCourier(courier);
			
			return flipkart;
		}
}
