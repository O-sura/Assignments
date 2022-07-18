
object Main{
    def easy(distance:Int) = {
        distance*8
    }

    def tempo(distance:Int) = {
        distance*7
    }

    def main(args:Array[String]) = {
        var total = easy(2)*2 + tempo(3);
        println(total)
    }
}