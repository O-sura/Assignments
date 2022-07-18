
object Main{
    
    var cover_price:Double = 24.95;
    var discount:Double = 0.4;

    def totalCost(quantity:Int):Double= {
        quantity*cover_price
    }

    def calcDiscount(cost:Double):Double = {
        cost*discount
    }

    def getShippingCost(quantity:Int):Double = {
        if(quantity > 50)
            50*3 + (quantity - 50)*0.75
        else
            quantity*3 
    }

    def getFinalCost(quantity:Int):Double = {
        totalCost(quantity) - calcDiscount(totalCost(quantity)) + getShippingCost(quantity)
    }
    
    def main(args:Array[String]) = {
        var copies:Int = 60;
        println("Cost for " + copies + ": " + getFinalCost(copies))
    }
}