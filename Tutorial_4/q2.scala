
object main extends App{
    println("Input a number>>>")
    var input = scala.io.StdIn.readInt()

    def decideNum(num:Int):Unit = num match {
        case x if(x <= 0) => println("Negative/Zero is input")
        case x if(x%2 == 0) => println("Even number is given")
        case x if(x%2 != 0)=> println("Odd number is given")
    }

    decideNum(input)
}
