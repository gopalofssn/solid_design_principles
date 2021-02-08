package com.gs.pattern.solid.interfacesegregation;

public class TeslaModel3 implements ElectricVehicle {

	@Override
	public void drive() {

		System.out.println("Driving Speed 55mph");
	}

	@Override
	public void stop() {

		System.out.println("Stopped for battery charge");

	}

	@Override
	public void batteryCapacity() {

		System.out.println("Battery Capacity 50-75 kWh");

	}

}
