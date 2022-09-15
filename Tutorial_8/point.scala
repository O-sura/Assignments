
object Main{

    case class Point(x:Int,y:Int){

        def +(p:Point):Point = {
            return new Point(x+p.x , y+p.y);
        }

        def move(d:Int):Point = {
            return this.copy(x = this.x+d,y = this.y+d);
        }

        def distance(p:Point):Double = {
            val d:Double = scala.math.sqrt(scala.math.pow((this.x - p.x),2) + scala.math.pow((this.y - p.y),2)).toDouble;
            return d;
        }

        def invert():Point = {
            return this.copy(x = this.y,y = this.x);
        }
    }

    def main(args: Array[String]) = {    
        var p1 = new Point(1,2);
        var p2 = new Point(3,4);
        var p3 = p1.+(p2);
        
        println(p1);
        println("Addition of " + p1 +"," + p2 + ": " + p3)
        println("Move p1 by 4: " + p1.move(4))
        println("Distance: " + p1.distance(p2))
        println("Inverted p1: " + p1.invert())
    }
    
}