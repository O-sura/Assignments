import math.Pi

object Main{
    
    def calculateArea(radius:Int) = {
        Pi*radius*radius;
    }
    
    def main(args: Array[String]) = {
        println("Enter the radius: ");
        var radius = scala.io.StdIn.readInt();
        println(calculateArea(radius))
    }
    
}