package com.parkinglot;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<ParkingSpot> spots = new ArrayList<>();

        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.BIKE));

        ParkingLot parkingLot = new ParkingLot(spots);

        Vehicle scootyJupiter = new Bike("KA-01-JC-1811");
        Vehicle carI20 = new Car("KA-04-HG-2322");

        System.out.println(parkingLot.park(scootyJupiter));
        System.out.println(parkingLot.park(carI20));

        ArrayList<ParkingSpot> parkingSpotStat = parkingLot.getParkingLotStats();
        for(ParkingSpot spot: parkingSpotStat) System.out.println(spot.isFree());


    }
}