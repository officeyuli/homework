package com.train

class TicketKotlin (var ticketNum:Int, var roundTripNum:Int){
    private val discount=0.9
    private val price=1000

    fun checkTicket()=ticketNum>roundTripNum
    fun printResult(){
        println("Total tickets: $ticketNum")
        println("Round-trip: $roundTripNum")
        println("Total: ${calculatePrice()}")
    }
    fun calculatePrice()=roundTripNum*discount*price*2+(ticketNum-roundTripNum)*price
}