

object Main{

    class  Rational(neu:Int,deno:Int){
        def neumerator = neu;
        def denominator = deno;
        
        def neg():Rational = new Rational(neumerator*(-1),denominator);

        def sub(r:Rational):Rational = {
           val x:Int = r.denominator*neumerator;
           val y:Int = denominator*r.neumerator;

           val newneu:Int = x - y;

           val newdeno:Int = denominator*r.denominator;
           return new Rational(newneu,newdeno);
        }

        override def toString(): String = neumerator + "/" + denominator;
    }

    def main(args: Array[String]) ={
        val r1:Rational = new Rational(1,2);

        val x:Rational = new Rational(3,4);
        val y:Rational = new Rational(5,8);
        val z:Rational = new Rational(2,7);

        
        println(r1.neg());
        println(x.sub(y.sub(z)))

        

    }

}