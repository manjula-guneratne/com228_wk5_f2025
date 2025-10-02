package com.mg.week5.multipleinheritance;

public interface LandVehicle {
	
	default void landInfo() {
		System.out.println("This is land info.");
	}
}
