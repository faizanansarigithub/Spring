package com.fa.test;

import com.fa.comp.Car;
import com.fa.factory.CarFactory;

public class FactoryPartternTest {

	public static void main(String[] args) {
		Car car=null;
		car=CarFactory.getInstace("luxory");
		car.drive();
		
		car=CarFactory.getInstace("sport");
		car.drive();
	}

}
