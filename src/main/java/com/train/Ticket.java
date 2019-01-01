package com.train;

public class Ticket {

    double oneWayPrice =1000;
    double discount=0.9;
    double roundTripPrice=oneWayPrice*2*discount;
    int tickets;
    int oneWayTicket;
    int roundTripTicket;

    public Ticket(int tickets, int roundTripTicket) {
        this.tickets = tickets;
        this.roundTripTicket = roundTripTicket;
        oneWayTicket = tickets-roundTripTicket;
    }

    public double getTotalPrice(){
        return (oneWayTicket*oneWayPrice)+(roundTripTicket*roundTripPrice);
    }

    public void printStatement(){
        System.out.println("Total tickets: "+tickets);
        System.out.println("Round-trip: "+roundTripTicket);
        System.out.println("Total: "+ getTotalPrice());
        System.out.println();
    }

}
