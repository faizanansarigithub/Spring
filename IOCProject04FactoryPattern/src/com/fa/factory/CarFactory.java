package com.fa.factory;

import com.fa.comp.AppoloTyre;
import com.fa.comp.BudgetCar;
import com.fa.comp.CENTTyre;
import com.fa.comp.Car;

import com.fa.comp.LuxoryCar;
import com.fa.comp.MRFTyre;
import com.fa.comp.SportsCar;
import com.fa.comp.Tyre;

public class CarFactory {
	//factory method
	public static Car getInstace(String carType) {
		Tyre tyre=null;
		Car car=null;
		if(carType.equalsIgnoreCase("luxory")) {
			tyre=new MRFTyre();
			car=new LuxoryCar(tyre);
		}
		else if(carType.equalsIgnoreCase("sport")) {
			tyre=new CENTTyre();
			car=new SportsCar(tyre);
		}
		if(carType.equalsIgnoreCase("budget")) {
			tyre=new AppoloTyre();
			car=new BudgetCar(tyre);
		}
		return car;
	}
}
