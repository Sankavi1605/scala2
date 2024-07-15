import scala.io.StdIn.readLine

object Q1 {
    // Function to get the list of products from the user
    def getProductList(n: List[String] = List()): List[String] = {
        val word = readLine("Enter string or 'done' to stop adding list: ")
        word match {
            case "done" => n
            case _ => getProductList(n :+ word)
        }
    }

    // Function to print the list of products with their indices
    def printProductList(products: List[String]): Unit = {
        products.zipWithIndex.foreach { case (product, index) =>
            println(s"${index + 1}. $product")
        }
    }

    // get the total number of products
    def getTotalProducts(products: List[String]): Int = {
        products.length
    }

    def main(args: Array[String]): Unit = {
        val products = getProductList() // Start with an empty list
        printProductList(products)
        println(s"Total number of products: ${getTotalProducts(products)}")
    }
}
