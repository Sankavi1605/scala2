
object Q2{
  def main(args: Array[String]): Unit = {
    val classifyNumber: Int => String = num => num match {
      case n if n <= 0    => "Negative/Zero is input"
      case n if n % 2 == 0 => "Even number is given"
      case n if n % 2 != 0 => "Odd number is given"
    }

    print("Enter a number: ")
    var inputNum = scala.io.StdIn.readInt()
    println(classifyNumber(inputNum))
    
}
}