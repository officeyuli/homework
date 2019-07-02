package com.train;

public class Ticket {
    private int ticketNum;
    private int roundTripNum;

    public Ticket(int ticketNum, int roundTripNum) {
        this.ticketNum = ticketNum;
        this.roundTripNum = roundTripNum;
    }

    public Boolean checkTicket(){
        return (this.ticketNum>this.roundTripNum);
    }
    public void printResult(){
        System.out.println("Total tickets: "+ticketNum);
        System.out.println("Round-trip: "+roundTripNum);
        double discount = 0.9;
        int price = 1000;
        System.out.println("Total: "+(price * discount *roundTripNum*2+(ticketNum-roundTripNum)* price));
    }
}
