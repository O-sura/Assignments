

object Main{

    def GCD(x:Int,y:Int):Int=y match{
        case 0 => x
        case n if(n >x) => GCD(n,x)
        case n => GCD(n,x%n)
    }

    def findPrime(a:Int,b:Int=2):Boolean=b match{
        case x if(x==a) => true
        case x if(GCD(a,x) > 1) => false
        case x => findPrime(a,x+1)
    }

    def printPrimes(n:Int,start:Int):Unit = {
        if(start < n){
            if(findPrime(start)) println(start)
            printPrimes(n,start+1)
        }
    }

    def main(args: Array[String]) = {
        printPrimes(20,2)
    }
}