import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val integer: Int = StdIn.readInt()
    
    integer match {
      case 0 => println("Zero is input")
      case n if n < 0 => println("Negative number is given")
      case n if n % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}

