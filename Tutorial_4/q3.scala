import scala.util.Random

object main extends App{

    case class Car(name:String,price:Double)

    val car1 = Car("bmw 3 series",20000)
    val car2 = Car("bmw 5 series",50000)
    val car3 = Car("vw passat",10000)
    val car4 = Car("vw golf",12000)
    val car5 = Car("mazda 3",15000)

    val carList:List[Car] = List(car1,car2,car3,car4,car5)

    class CarUUID(car:Car){
        val _model:String = car.name
        val _hash:Int = Random.nextInt().abs
        val _uuid:String = _model + "-"+_hash.toString()

        def uuid:String = _uuid

    }

    def printUUID(carList:List[Car]):Unit = {
        carList.foreach{
            car => val id = CarUUID(car)
                   println("car uuid = " + id.uuid)
        }
    }

    printUUID(carList)
}