
import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number which you like: ")
    val num = StdIn.readLine().toInt

    num match {
      case 0 => println("Number is zero")
      case n if n < 0 => println("Negative number")
      case n if n % 2 == 0 => println("Even number")
      case _ => println("Odd number")
    }
  }
}
