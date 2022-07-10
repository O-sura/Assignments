object Main{
    def main(args: Array[String]) = {
    def no_of_attendes(ticket_price:Int):Int=120+(15-ticket_price)/5*20

    def totalIncome(ticket_price:Int):Int=no_of_attendes(ticket_price)*ticket_price

    def totalCost(ticket_price:Int):Int = 500+no_of_attendes(ticket_price)*3

    def totalProfit(ticket_price:Int):Int=totalIncome(ticket_price)-totalCost(ticket_price)

    println(totalProfit(17));
    }
}