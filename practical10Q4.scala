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

  override def toString: String = f"Account(balance: $$${currentBalance}%.2f)"
}

class Bank(accounts: List[Account]) {

  def negativeBalances: List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach { acc =>
      val balance = acc.getBalance
      if (balance > 0) {
        acc.deposit(balance * 0.05)
      } else {
        acc.deposit(balance * 0.10)
      }
    }
  }
}

object MainApp {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(1000.00)
    val acc2 = new Account(500.00)
    val acc3 = new Account(-200.00)
    val bank = new Bank(List(acc1, acc2, acc3))

    println("Initial Balances:")
    println(s"Account1: ${acc1}")
    println(s"Account2: ${acc2}")
    println(s"Account3: ${acc3}")

    println("\nNegative Balances:")
    bank.negativeBalances.foreach(println)

    println("\nTotal Balance of all accounts:")
    println(f"Rs.${bank.totalBalance}%.2f")

    println("\nApplying interest...")
    bank.applyInterest()

    println("\nBalances after applying interest:")
    println(s"Account1: ${acc1}")
    println(s"Account2: ${acc2}")
    println(s"Account3: ${acc3}")
  }
}

