package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<ParkingSpot> floor1Spots = new ArrayList<>();
        floor1Spots.add(new ParkingSpot(VehicleType.BIKE));
        floor1Spots.add(new ParkingSpot(VehicleType.CAR));

        List<ParkingSpot> floor2Spots = new ArrayList<>();
        floor2Spots.add(new ParkingSpot(VehicleType.TRUCK));
        floor2Spots.add(new ParkingSpot(VehicleType.HELICOPTER));

        ParkingFloor floor1 = new ParkingFloor("F1", floor1Spots);
        ParkingFloor floor2 = new ParkingFloor("F2", floor2Spots);

        List<ParkingFloor> floors = new ArrayList<>();
        floors.add(floor1);
        floors.add(floor2);

        ParkingLot parkingLot = new ParkingLot(floors);

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