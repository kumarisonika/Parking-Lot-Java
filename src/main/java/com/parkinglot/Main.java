package com.parkinglot;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<ParkingSpot> spots = new ArrayList<>();

        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.CAR));
        spots.add(new ParkingSpot(VehicleType.TRUCK));
        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.HELICOPTER));
        spots.add(new ParkingSpot(VehicleType.HELICOPTER));

        ParkingLot parkingLot = new ParkingLot(spots);

        Vehicle bike1 = new Bike("KA-01-JC-1811");
        Vehicle car1 = new Car("PEA-23-sd234-heli");
        Vehicle helicopter1 = new Helicopter("PEA-23-sd234-heli");

        ParkingTicket parkingTicket_bike = parkingLot.park(bike1);
        ParkingTicket parkingTicket_car = parkingLot.park(car1);
        ParkingTicket parkingTicket_helicopter = parkingLot.park(helicopter1);

        int bikeAmount= parkingLot.unPark(parkingTicket_bike);
        int carAmount= parkingLot.unPark(parkingTicket_car);
        int heliAmount= parkingLot.unPark(parkingTicket_helicopter);
        System.out.println("Bike parking fee: "+ bikeAmount);
        System.out.println("Car parking fee: "+ carAmount);
        System.out.println("Helicopter parking fee: "+ heliAmount);

    }
}