
object Main{

    def getSum(x:Int):Int=x match{
        case x if(x>0) => x + getSum(x-1)
        case _ => 0
    }

    def main(args: Array[String]) = {
        println(getSum(5))
        println(getSum(10))
    }

}