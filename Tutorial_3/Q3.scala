
object Main{
    def getVol(radius:Double) = 1.333333*math.Pi*radius*radius*radius

    def main(args:Array[String]) = {
        val radius:Double = 5;
        println(getVol(radius))
    }
}