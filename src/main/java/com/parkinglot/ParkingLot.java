package com.parkinglot;
import java.util.ArrayList;

public class ParkingLot{

    private ArrayList<ParkingSpot> parkingSpots;

    ParkingLot(ArrayList<ParkingSpot> parkingSpots){
        this.parkingSpots = parkingSpots;
    }

    String park(Vehicle vehicle){
        for(ParkingSpot spot: parkingSpots){

            if(spot.canPark(vehicle)){
                spot.park(vehicle);
                return "Vehicle sucessfully parked!";
            }
        }
        return "No empty spots left!";
    }

    String unPark(ParkingSpot parkingSpot){
        parkingSpot.unPark();
        return "vehicle was successfully nunparked!";
    }

    ArrayList<ParkingSpot> getParkingLotStats(){
        return parkingSpots;
    }
}