package com.mg.week5.multipleinheritance;


public class DriverTest {

	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		s1.waterInfo();
		// Can only access interface specific method only...
		
		System.out.println("***************");
		
		WaterVehicle s2 = new Sample();
		s2.waterInfo();
		
		System.out.println("***************");
		
		LandVehicle s3 = new Sample();
		s3.landInfo();
	}

}
