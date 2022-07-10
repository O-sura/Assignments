
object Main{
    def main(args: Array[String]) = {
        var k,i,j = 2;
        var m,n=5;
        val f = 12.0f;
        val g = 4.0f;
        val c = 'X';  

        println(k + 12 * m);
        println(m/j);
        println(n%j);
        println(m/j*j);
        println(f+10*5+g);

        //In scala the prefix and postfix incrementing features are not available
        //To obtain the same functionality following expression is been used
        println((1+i)*n);
    }
}