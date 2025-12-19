package com.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private TicketStatus status;
    private LocalDateTime exitTime;

    public ParkingTicket(String ticketId, Vehicle vehicle, ParkingSpot parkingSpot){
        this.ticketId= ticketId;
        this.vehicle=vehicle;
        this.parkingSpot=parkingSpot;
        this.entryTime= LocalDateTime.now();
        this.status = TicketStatus.ACTIVE;
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

    void close(){
        this.exitTime = LocalDateTime.now();
        this.status = TicketStatus.CLOSED;
    }

    public Duration getParkingDuration(){
        if(exitTime==null) throw new IllegalStateException("Vehicle not exited yet");
        return Duration.between(entryTime,exitTime);
    }
}
