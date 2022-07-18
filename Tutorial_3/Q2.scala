
object Main{
    
    def getFar(celcius:Double) = {
        celcius*1.8 + 32.00
    }
    
    def main(args: Array[String]) = {
        var temp:Double = 35;
        println(getFar(temp))
    }
}