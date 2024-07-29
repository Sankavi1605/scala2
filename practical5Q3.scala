import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Fibonacci {
    def main(args: Array[String]): Unit = {
        
        def fibonacci(n: Int): Int = n match {
            case 0 => 0
            case 1 => 1
            case _ => fibonacci(n - 1) + fibonacci(n - 2)
        }

        def printFibonacciSeries(n: Int): Unit = {
            for (i <- 0 until n) {
                print(fibonacci(i)+" ")
            }
        
        }

        print("Enter the number of Fibonacci terms: ")
        val num = readInt()
        println("The first " +num+" terms of the Fibonacci series are:")
        printFibonacciSeries(num)
    }
}
