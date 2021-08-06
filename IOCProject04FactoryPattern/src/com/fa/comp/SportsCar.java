package com.fa.comp;

public class SportsCar implements Car {
	private Tyre tyre;
	public SportsCar(Tyre tyre) {
		this.tyre=tyre;
	}

	@Override
	public void drive() {
		System.out.println("Driving Sports CAR having "+tyre.roadGrip());
	}

}
