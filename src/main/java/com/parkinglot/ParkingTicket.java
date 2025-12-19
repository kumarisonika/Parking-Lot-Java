package com.parkinglot;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private TicketStatus status;
    private double pricing;

    public ParkingTicket(String ticketId, Vehicle vehicle, ParkingSpot parkingSpot){
        this.ticketId= ticketId;
        this.vehicle=vehicle;
        this.parkingSpot=parkingSpot;
        this.entryTime= LocalDateTime.now();
        this.status= TicketStatus.ACTIVE;
        this.pricing= 0;
    }

    public String getTicketId(){ return ticketId; }

    public Vehicle getVehicle(){ return vehicle; }

    public ParkingSpot getParkingSpot(){ return  parkingSpot; }

    public LocalDateTime getEntryTime(){
        return entryTime;
    }

    public TicketStatus getStatus(){
        return status;
    }

    double close(){
        //calculate pricing when closing the ticket
        if(parkingSpot.supportedType==VehicleType.BIKE){
            pricing=10;
        }else if(parkingSpot.supportedType==VehicleType.CAR){
            pricing=50;
        }else{
            pricing=70;
        }
        this.status= TicketStatus.CLOSED;
        return pricing;
    }
}
