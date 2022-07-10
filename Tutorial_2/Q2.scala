object Main{
    def main(args: Array[String]) = {
        
        var(a,b,c,d) = (2,3,4,5)
        var g = 4.0f;
        var k:Float = 4.3f;

        //NOTE:
        //In scala the prefix and postfix incrementing or decrementing features are not available

        //println( - -b * a + c *d - -);
        b -= 1
        println(b * a + c *d);
        d -= 1

        // println(a++);
        a += 1
        println(a);

        println (-2*(g-k)+c);

        // println (c=c++);
        c = c + 1
        println(c)

        // println (c=++c*a++);
        c += 1
        c = c * a
        a += 1
        println(c)
    }
}