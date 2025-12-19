package com.parkinglot;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<ParkingSpot> spots = new ArrayList<>();

        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.CAR));
        spots.add(new ParkingSpot(VehicleType.TRUCK));
        spots.add(new ParkingSpot(VehicleType.BIKE));

        ParkingLot parkingLot = new ParkingLot(spots);

        Vehicle scootyJupiter = new Bike("KA-01-JC-1811");
        Vehicle carI20 = new Car("KA-04-HG-2322");

        ParkingTicket parkingTicket_bike = parkingLot.park(scootyJupiter);
        ParkingTicket parkingTicket_car = parkingLot.park(carI20);

        System.out.println(parkingTicket_bike.getEntryTime()+" "+parkingTicket_bike.getVehicle().getVehicleNumber());

        System.out.println(parkingLot.unPark(parkingTicket_bike));
        System.out.println(parkingLot.unPark(parkingTicket_bike));

    }
}