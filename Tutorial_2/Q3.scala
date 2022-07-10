object Main{
    def main(args: Array[String]) = {
    var normal_rate:Double = 250

    var ot_rate:Double = 85

    def income(normal:Double,ot:Double):Double=normal*normal_rate+ot*ot_rate

    def taxPay(totalPay:Double):Double=totalPay*0.12

    def takehomeSalary(normal:Double,ot:Double):Double=income(normal,ot)-taxPay(income(normal,ot))

    println(takehomeSalary(40,30));
    }
}