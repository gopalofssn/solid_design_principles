package com.gs.pattern.solid.interfacesegregation;

public class BiCycle implements BaseVehicle{

	@Override
	public void drive() {

		System.out.println("Driving 15 mph");
		
	}

	@Override
	public void stop() {

		System.out.println("Stopped for lunch !!!");
		
	}

}
