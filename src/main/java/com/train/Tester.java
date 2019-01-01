package com.train;


import java.util.Scanner;

public class Tester {




    public static void main(String[] args) {

        int numberOfTicket;
        int numberOfRoundTicket;

        Scanner scanner = new Scanner(System.in);

        try {

                int exitCode =0;

                while(exitCode!=-1) {

                    System.out.print("Please enter number of tickets:");
                    numberOfTicket = scanner.nextInt();

                        if(numberOfTicket==-1) {
                            exitCode = -1;
                            break;
                        }

                    System.out.print("How many round-trip tickets:");
                    numberOfRoundTicket = scanner.nextInt();

                        if(numberOfRoundTicket==-1){
                            exitCode=-1;
                            break;
                        }

                    if (numberOfTicket > numberOfRoundTicket) {
                        Ticket ticket = new Ticket(numberOfTicket, numberOfRoundTicket);
                        ticket.printStatement();
                    } else {
                        System.out.println("Round Trip tickets cannot be greater than total tickets");
                        System.out.println();
                    }


                }

        }catch (Exception e){

            System.out.println("Please enter a valid number");

        }




    }

}
