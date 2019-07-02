package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        boolean endPoint=false;
        do{
            System.out.println("Please enter number of tickets: ");
            Scanner scanner=new Scanner(System.in);
            int ticketNum=Integer.parseInt(scanner.next());
            System.out.println("How many round-trip tickets:  ");
            int roundTripNum=Integer.parseInt(scanner.next());
            TicketKotlin ticket=new TicketKotlin(ticketNum,roundTripNum);
            if(ticket.checkTicket()){
                ticket.printResult();
                endPoint=true;
            }
            else
                System.out.println("Please enter again");
        }while(!endPoint);

    }
}
