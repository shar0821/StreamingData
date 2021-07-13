package com.demo.truck.data;

import java.util.UUID;

public class GenrateTruckInfo {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Variant:" + generatevariant());

			System.out.println("Confirmed Cases:" + generateconfirmedCaseNumber(7,219570));

			System.out.println("Probable Cases:" + generateprobableCaseNumber(0,41773));

			System.out.println("Total Cases:" + generatetotalCaseNumber(7,225085));

			System.out.println("Proportion:" + generatecaseProportion(0,70.3));

			System.out.println("Death:" + generatedeaths(0,21950));

			System.out.println("Fatality" + generateCaseFatality(0,50000));

			System.out.println("Fatality28:" + generateCaseFatality28(0,50000));
			System.out.println("----------------------------");

		}
	}

	/**
	 * @Description: Randomly generate latitude and longitude within a rectangle
	 * @param MinLon: minimum longitude MaxLon: maximum longitude MinLat: minimum
	 *                latitude MaxLat: maximum latitude
	 * @return @throws
	 */
	

	/*public static String generateRandomVehicleId() {
		return UUID.randomUUID().toString();
	}

	public static String generateRandomVehicleType() {
		String[] vehicleTypeArray = { "Car", "Truck", "Bus", "Mini-Van", "Auto" };
		return vehicleTypeArray[new Random().nextInt(vehicleTypeArray.length)];
	}

	public static double generateSensorData(double min, double max) {
		return Math.random() * (max - mini) + mini;
	}
	*/
    public static String generatevariant(){
    	return UUID.randomUUID().toString();
    }
    public static long generateconfirmedCaseNumber(double min, double max){
    	return (long) (Math.random()*(max - min) + min);
    }
    public static long generateprobableCaseNumber(double min, double max){
    	return (long) (Math.random() * (max - min) + min);
    }
    public static long generatetotalCaseNumber(double min, double max){
    	return (long) (Math.random() * (max - min) + min);
    }
    public static long generatecaseProportion(double min, double max){
    	return (long) (Math.random() * (max - min) + min);
    }
    public static long generatedeaths(double min, double max){
    	return (long) (Math.random() * (max - min) + min);
    }
    public static long generateCaseFatality(double min, double max){
    	return (long) (Math.random() * (max - min) + min);
    }
    public static long generateCaseFatality28(double min, double max){
    	return (long) (Math.random() * (max - min) + min);
    }
}