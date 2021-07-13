package com.demo.truck.data;

import static com.demo.truck.data.GenrateTruckInfo.generatevariant;
import static com.demo.truck.data.GenrateTruckInfo.generateconfirmedCaseNumber;
import static com.demo.truck.data.GenrateTruckInfo.generateprobableCaseNumber;
import static com.demo.truck.data.GenrateTruckInfo. generatetotalCaseNumber;
import static com.demo.truck.data.GenrateTruckInfo. generatecaseProportion;
import static com.demo.truck.data.GenrateTruckInfo.generatedeaths;
import static com.demo.truck.data.GenrateTruckInfo. generateCaseFatality;
import static com.demo.truck.data.GenrateTruckInfo. generateCaseFatality28;

import java.util.Random;

public class SendVehicleDataToKafka {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			int records = new Random().nextInt(5);//in-memory mutable 4Bytes
			///RDD rdd1 = rdd.load("truck_info.json")// 2551818(2.5) < 128 MB(block size) 16 blocks (4 nodes 4 block each)
			for (int i = 1; i <= records; i++) {
				VehicleInfo vehicleInfo = new VehicleInfo();
				vehicleInfo.setVariant(generatevariant());
				vehicleInfo.setConfirmedCaseNumber(generateconfirmedCaseNumber(7,219570));
				vehicleInfo.setProbableCaseNumber(generateprobableCaseNumber(0,41773));
				vehicleInfo.setTotalCaseNumber(generatetotalCaseNumber(7,225085));
				vehicleInfo.setCaseProportion(generatecaseProportion(0,70.3));
				vehicleInfo.setDeaths(generatedeaths(0,21950));
				vehicleInfo.setCaseFatality(generateCaseFatality(0,50000));
				vehicleInfo.setCaseFatality28(generateCaseFatality28(0,50000));
				// SimpleKafkaProducer.sendDataToKafkaSingleBroker(vehicleInfo.toString(),
				// "truckInfo");
				//SimpleKafkaProducer.sendDataToKafkaMultipleBroker(vehicleInfo.toString(), "truck-info-new",
						//vehicleInfo.getVehicleType());
			}
			System.out.println("Written " + records + " to Kafka..");
			Thread.sleep(3000);
		}

	}

}
