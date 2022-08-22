
object Hello{

    def isEven(x:Int):Boolean=x match{
        case 0 => true
        case _ => isOdd(x-1)
    }

    def isOdd(y:Int):Boolean = !isEven(y)

    def main(args: Array[String]) = {
        println(isEven(10))
        println(isEven(9))
    }
}