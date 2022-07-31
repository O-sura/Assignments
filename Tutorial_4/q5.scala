object main extends App{

    def toUpper(input:String):String = {
        input.toUpperCase()
    }

    def toLower(input:String):String = {
        input.toLowerCase()
    }

    def formatNames(input:String)(special:List[Int])(function:String => String):String = {
        if(special.isEmpty){
           return function(input)
        }
        var new_str:String = ""
        var i:Int = 0
        while(i<input.length()){
            if(special.contains(i)){
                new_str = new_str + function(input.charAt(i).toString())
            }
            else
                new_str = new_str + input.charAt(i).toString()
            i += 1
        }
        return new_str
    }

    println(formatNames("Benny")(List())(toUpper(_)))
    println(formatNames("Niroshan")(List(0,1))(toUpper(_)))
    println(formatNames("Saman")(List())(toLower(_)))
    println(formatNames("Kumara")(List(5))(toUpper(_)))
}