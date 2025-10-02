package com.mg.week5.multipleinheritance;

public interface WaterVehicle {
	
	default void waterInfo() {
		System.out.println("This is water info.");
	}
}


