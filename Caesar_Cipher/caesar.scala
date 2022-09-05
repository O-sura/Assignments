
object Main{

    //encryption = (index + shift) % 26
    //decryption = ((index - shift)+26) % 26

    // var indexList = orgMsg.map((char) => alp.indexOf(char.toUpper))
    // var newIndex = indexList.map((index) => (index +shift))
    // var encMsg  = newIndex.map((index) => alp.charAt(index)).mkString

    val encryptMsg = (orgMsg:String, alp:String,shift:Int) =>
                        orgMsg.map((char) => alp.indexOf(char.toUpper))
                        .map((index) => (index+shift)%alp.size)
                        .map((index) => alp.charAt(index)).mkString


    val decryptMsg = (encMsg:String,alp:String,shift:Int) =>
                        encMsg.map((char) => alp.indexOf(char.toUpper))
                        .map((index) => ((index - shift) + alp.size)%alp.size)
                        .map((index) => alp.charAt(index)).mkString
        
    

    val cipherMsg = (f:(m:String,a:String,s:Int)=>String, msg:String, alpabet:String, shiftNo:Int) => 
        f(msg,alpabet,shiftNo)
    


    def main(args: Array[String]) = {
        
        val alphabet:String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "
        
        
        println(cipherMsg(encryptMsg,"osura",alphabet,3))
        println(cipherMsg(decryptMsg,"RVXUD",alphabet,3))
        
        
        println(cipherMsg(encryptMsg,"THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",alphabet,23))
        println(cipherMsg(decryptMsg,"PDAWMQEZGWYNKSJWBKTWFQILOWKRANWPDAWHXVUW KC",alphabet,23))

    }

}


