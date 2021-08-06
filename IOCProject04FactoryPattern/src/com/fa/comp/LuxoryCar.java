package com.fa.comp;

public class LuxoryCar implements Car {
	private Tyre tyre;
	
	public LuxoryCar(Tyre tyre) {
		this.tyre=tyre;
	}

	@Override
	public void drive() {
		System.out.println("Driving Luxory CAR having "+tyre.roadGrip());
	}

}
