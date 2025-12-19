package com.parkinglot;
import java.util.List;

public class ParkingFloor {
    private String floorId;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(String floorId, List<ParkingSpot> parkingSpots){
        this.floorId = floorId;
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle){
        for(ParkingSpot spot: parkingSpots){
            if(spot.canPark(vehicle)) return spot;
        }
        return null;
    }

    public String getFloorId(){
        return floorId;
    }

    public List<ParkingSpot> getParkingSpots(){
        return parkingSpots;
    }
}
