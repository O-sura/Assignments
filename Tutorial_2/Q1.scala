
object Main{
    def main(args: Array[String]) = {
        var k,i,j = 2;
        var m,n=5;
        val f = 12.0f;
        val g = 4.0f;
        val c = 'X';  

        println(k + 12 * m); //62
        println(m/j); //2
        println(n%j); //1
        println(m/j*j); //4
        println(f+10*5+g); //66.0

        //In scala the prefix and postfix incrementing features are not available
        //To obtain the same functionality following expression is been used
        println((1+i)*n); //15
    }
}
