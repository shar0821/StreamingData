package com.demo.truck.data;

import static com.demo.truck.data.GenrateTruckInfo.generatevariant;
import static com.demo.truck.data.GenrateTruckInfo.generateconfirmedCaseNumber;
import static com.demo.truck.data.GenrateTruckInfo.generateprobableCaseNumber;
import static com.demo.truck.data.GenrateTruckInfo. generatetotalCaseNumber;
import static com.demo.truck.data.GenrateTruckInfo. generatecaseProportion;
import static com.demo.truck.data.GenrateTruckInfo.generatedeaths;
import static com.demo.truck.data.GenrateTruckInfo. generateCaseFatality;
import static com.demo.truck.data.GenrateTruckInfo. generateCaseFatality28;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenreateRandomTruckInfoJson {

	public static void main(String[] args) throws InterruptedException, IOException {

		while (true) {
			File file = new File("/Users/91893/Documents/Project/variant" + ".json");
			int records = new Random().nextInt(15);
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
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.append(vehicleInfo.toString()+"\n");
				bw.flush();
				bw.close();
			}
			Thread.sleep(300);
		}
	}
}