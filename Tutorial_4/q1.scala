
object main extends App{
    def findInterest(deposits:Double):Double = deposits match {
        case x if x <= 20000 => x*0.02
        case x if 20000 < x && 200000 >= x => x*0.04
        case x if 200000 < x && 2000000 >= x => x*0.035
        case x if 2000000 < x => x*0.06
    }

    println(findInterest(10000))
    println(findInterest(100000))
    println(findInterest(1000000))
    println(findInterest(10000000))
}