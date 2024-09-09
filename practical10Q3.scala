class Account(private var currentBalance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      currentBalance += amount
    } else {
      println("Error: Deposit amount must be positive")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= currentBalance) {
      currentBalance -= amount
    } else {
      if (amount > 0) println("Error: Insufficient funds")
      else println("Error: Withdrawal amount must be positive")
    }
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    if (amount > 0 && amount <= currentBalance) {
      this.withdraw(amount)
      targetAccount.deposit(amount)
    } else {
      if (amount > 0) println("Error: Insufficient funds for transfer")
      else println("Error: Transfer amount must be positive")
    }
  }

  def getBalance: Double = currentBalance

  override def toString: String = f"Account(balance: Rs.$$${currentBalance}%.2f)"
}

object MainApp {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(1000.00)
    val acc2 = new Account(500.00)

    println(s"Initial balance of account1: ${acc1}")
    println(s"Initial balance of account2: ${acc2}")

    acc1.deposit(200.00)
    println(s"After depositing Rs.200 into account1: ${acc1}")

    acc1.withdraw(150.00)
    println(s"After withdrawing Rs.150 from account1: ${acc1}")

    acc1.transfer(300.00, acc2)
    println(s"After transferring Rs.300 from account1 to account2:")
    println(s"Account1: ${acc1}")
    println(s"Account2: ${acc2}")
  }
}

