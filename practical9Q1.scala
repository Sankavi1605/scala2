object Q1 {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = deposit => deposit match {
      case d if d <= 20000     => d * 0.02
      case d if d <= 200000    => d * 0.04
      case d if d <= 2000000   => d * 0.035
      case d if d > 2000000    => d * 0.065
    }
     print("Deposit amount: ")
    var depositInput = scala.io.StdIn.readDouble()

    println("Yearly interest amounts to: " + calculateInterest(depositInput))
}
}
