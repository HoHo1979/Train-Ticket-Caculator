package com.train;


import java.util.Scanner;

public class Tester {




    public static void main(String[] args) {

        int numberOfTicket;
        int numberOfRoundTicket;

        Scanner scanner = new Scanner(System.in);

        try {

                System.out.print("Please enter number of tickets:");
                numberOfTicket = scanner.nextInt();
                System.out.print("How many round-trip tickets:");
                numberOfRoundTicket = scanner.nextInt();

                if(numberOfTicket>numberOfRoundTicket){
                    Ticket ticket = new Ticket(numberOfTicket, numberOfRoundTicket);
                    ticket.printStatement();
                }else{
                    System.out.println("Round Trip tickets cannot be greater than total tickets");
                }


        }catch (Exception e){

            System.out.println("Please enter a valid number");

        }




    }

}
