
object Hello{

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

    def main(args: Array[String]) = {
        println(findPrime(5))
        println(findPrime(8))
    }
}