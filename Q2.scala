import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    var integer: Int = StdIn.readInt()
    
    integer match {
      case n if n == 0 => println("Zero is input")
      case n if n< 0 =>println("negative ")
      case n if n % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}
