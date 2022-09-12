
object Main{

    class BankAccount(money:Double,name:String,accNo:Int){
        //Individual account attributes
        val owner:String = name;
        private val accountNo:Int = accNo;
        var balance:Double = money;
        
        //Get account balance
        def getBalance = balance;

        def showAcc = (name,accNo);

        //Transfer money from one acc to another
        def transfer(receiver:BankAccount,amount:Double) = {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            println("Successfully transfered amount " + amount.toString +" to "+receiver.owner);
            
        }
    }

    //Creating the bank account list(Bank)
    var Bank:List[BankAccount] = List[BankAccount]();
    
    //Bank methods

    //Display all accounts
    val showAccounts = (b:List[BankAccount]) => b.map((account) => account.showAcc) 
    //Show accounts with negative balance
    val overdraft = (b:List[BankAccount]) => b.filter(account => account.balance < 0.0).map((acc) => acc.showAcc)
    //Total balance of all accounts
    val totalBalance = (b:List[BankAccount]) => b.foldLeft(0.0)((x, y) => x + y.balance) 
    //Individual balance of an account
    val individualBalance = (b:List[BankAccount]) => b.map((x) => x.balance) 
    //Calc Interest
    val interest = (b:List[BankAccount]) => b.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1) 


    def main(args: Array[String]) = {
        
        val a:BankAccount  = new BankAccount(200.12,"A",1001);
        val b:BankAccount  = new BankAccount(-100.00,"B",1002);
        val c:BankAccount  = new BankAccount(0.00,"C",1003);
        println(a.getBalance);
        a.transfer(b,50.0);
        println("Balance A: " + a.getBalance);
        println("Balance B: " + b.getBalance);
        
        
        //Adding bank account to the bank
        Bank = Bank:+a:+b:+c; 
        println("\nAll Accounts:")
        println(showAccounts(Bank))


        //list of negative balances(overdraft)
        println("\nAccounts with overdraft: ")
        println(overdraft(Bank))

        //sum of all account balances
        println("\nSum of all account balances: " + totalBalance(Bank))

        //final balances of all accounts after apply the interest
        val l1 = interest(Bank);
        val l2 = individualBalance(Bank)
        val l3 = l2.zipAll(l1, 0, 0).map { case (a:Double,b:Double) => a+b }
        // println(l2)
        // println(l1)
        println("\nFinal balances(with Interests): ")
        println(l3)
    }
}