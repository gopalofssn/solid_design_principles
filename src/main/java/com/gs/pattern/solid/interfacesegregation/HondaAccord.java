package com.gs.pattern.solid.interfacesegregation;

public class HondaAccord implements GasolineVehicle{

	@Override
	public void drive() {

		System.out.println("Driving speed 65mph");
		
	}

	@Override
	public void stop() {

		System.out.println("Stopped at RestArea");
		
	}

	@Override
	public void fuelTankCapacity() {

		System.out.println("Fuel tank capacity 16 gallons");
		
	}

}
