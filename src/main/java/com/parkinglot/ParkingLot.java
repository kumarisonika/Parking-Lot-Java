package com.parkinglot;
import java.util.ArrayList;
import java.util.UUID;

public class ParkingLot{

    private ArrayList<ParkingSpot> parkingSpots;

    ParkingLot(ArrayList<ParkingSpot> parkingSpots){
        this.parkingSpots = parkingSpots;
    }

    public ParkingTicket park(Vehicle vehicle){
        for(ParkingSpot spot: parkingSpots){

            if(spot.canPark(vehicle)){
                spot.park(vehicle);
                return new ParkingTicket(UUID.randomUUID().toString(), vehicle,spot);
            }
        }
        return null;
    }

    public String unPark(ParkingTicket ticket){
        ParkingSpot spot = ticket.getParkingSpot();
        spot.unPark();
        return "vehicle was successfully unparked!";
    }

    ArrayList<ParkingSpot> getParkingLotStats(){
        return parkingSpots;
    }
}