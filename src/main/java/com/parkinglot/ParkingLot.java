package com.parkinglot;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot{

    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors){
        this.floors = floors;
    }

    public ParkingTicket park(Vehicle vehicle){
        for(ParkingFloor floor: floors){
            ParkingSpot spot = floor.getAvailableSpot(vehicle);
            if(spot!=null) {
                spot.park(vehicle);
                return new ParkingTicket(UUID.randomUUID().toString(), vehicle, spot);
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

}