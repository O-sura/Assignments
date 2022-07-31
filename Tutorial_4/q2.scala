
object main extends App{
    final case class CartItem(name:String,price:Double,quantity:Int)

    var item1 = CartItem("Vanilla Ice Cream",3.99,13)
    var item2 = CartItem("Chocolate Biscuit",4,6)
    var item3 = CartItem("Cupcakes",7.77,7)

    val shoppingCart: Set[CartItem] = Set(item1,item2,item3)

    def printCart(cartItems:Set[CartItem]):Unit = {
        cartItems.foreach{
            cartItem => println(cartItem.quantity +" "+ cartItem.name+ " at " + cartItem.price + " each")
        }
    }

    printCart(shoppingCart)

    def clasifyItem(cartItems:Set[CartItem]):Unit = {
        cartItems.foreach{
            cartItem => if(cartItem.name.contains("Vanilla Ice Cream")) 
                            println("Vanilla Ice Cream")
                        else
                            println("Found another product")
        }
    }
    println("\n")
    clasifyItem(shoppingCart)
}