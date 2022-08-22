
object Main{

    def fibNum(x:Int):Int=x match{
        case 0 => 0
        case 1 => 1
        case _ => fibNum(x-1) + fibNum(x-2)
    }
    
    def printFibSeq(n:Int,count:Int):Unit = {
        if(count < n){
            println(fibNum(count))
            printFibSeq(n,count+1)
        }
    }

    def main(args: Array[String]) = {
        printFibSeq(10,0)
    }
}