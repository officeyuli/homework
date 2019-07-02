package com.train

import java.util.*

fun main(args: Array<String>) {
    var endPoint=false
    val scanner = Scanner(System.`in`)
    do {
        println("Please enter number of tickets: ")
        val ticketNum = scanner.nextInt()
        println("How many round-trip tickets: ")
        val roundNum = scanner.nextInt()
        val ticket=TicketKotlin(ticketNum,roundNum)
        if(ticket.checkTicket()){
            ticket.printResult()
            endPoint=true
        }else
            println("Please enter again")
    }while (!endPoint)

}