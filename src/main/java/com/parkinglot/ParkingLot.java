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

    public int unPark(ParkingTicket ticket){
        if(ticket.getStatus() == TicketStatus.CLOSED) throw new IllegalStateException("Ticket already used!");
        ParkingSpot spot = ticket.getParkingSpot();
        spot.unPark();
        ticket.close();

        PricingStrategy strategy =  PricingStrategyFactory.getStrategy(ticket.getVehicle().getType());

        return strategy.calculatePrice(ticket.getParkingDuration());
    }

    ArrayList<ParkingSpot> getParkingLotStats(){
        return parkingSpots;
    }
}