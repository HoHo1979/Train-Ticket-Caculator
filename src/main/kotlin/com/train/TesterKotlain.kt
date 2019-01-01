package com.train

import java.util.*

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)

    var exitCode=0

    while(exitCode!=-1) {

        print("Please enter number of tickets:")
        var ticket = scanner.nextInt()

        if (ticket==-1) {
            break
        }

        print("How many round-trip tickets:")
        var roundTripTick = scanner.nextInt()

        if(roundTripTick==-1){
            break;
        }

        var tickets = KotlinTicket(ticket, roundTripTick)
        tickets.printStatements()

    }
}


class KotlinTicket(var numTicket:Int,var numRoundTripTicket:Int){

    val oneWayPrice = 1000
    val discount = 0.9
    val roundTripPrice= oneWayPrice*2*discount
    var oneWayTicket=numTicket-numRoundTripTicket

    fun getTotalPrice():Double{
        return oneWayTicket*oneWayPrice+numRoundTripTicket*roundTripPrice;
    }

    fun printStatements(){

        println("Total tickets: $numTicket")
        println("Round-trip: $numRoundTripTicket")
        println("Total: " + getTotalPrice())
        println()
    }

}