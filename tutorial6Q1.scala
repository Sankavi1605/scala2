object Q1 {
  val inventory1: Map[Int, (String, Int, Double)] = Map(
    101 -> ("abc", 10, 19.56),
    102 -> ("bcd", 5, 29.98),
    103 -> ("pqr", 8, 15.4)
  )

  val inventory2: Map[Int, (String, Int, Double)] = Map(
    102 -> ("bcd", 7, 25.67),
    104 -> ("lmn", 3, 22.5)
  )

  def main(args: Array[String]): Unit = {
    //Retrieve all product names from inventory1
    val productNames: Set[String] = inventory1.values.map(_._1).toSet
    println("Product Names: " +productNames)

    //Calculate the total value of all products in inventory1
    val totalValue: Double = inventory1.values.map { case (_, quantity, price) => quantity * price }.sum
    println("Total Value:"+totalValue)

    //Check if inventory1 is empty
    val isEmpty: Boolean = inventory1.isEmpty
    println("Is Inventory1 is Empty? "+isEmpty)

    //Merge inventory1 and inventory2, updating quantities and retaining the highest price
    val mergedInventory: Map[Int, (String, Int, Double)] = (inventory1 ++ inventory2).map { case (id, (name, quantity, price)) =>
      val (existingName, existingQuantity, existingPrice) = (inventory1 ++ inventory2).getOrElse(id, (name, 0, 0.0))
      (id, (name, existingQuantity + quantity, math.max(existingPrice, price)))
    }
    println("Merged Inventory: "+ mergedInventory )

    //Check if a product with a specific ID exists and print its details
    val productIdToCheck = 102
    inventory1.get(productIdToCheck) match {
      case Some((name, quantity, price)) =>
        println("Product ID "+ productIdToCheck+ "exists: Name = " +name+ ", Quantity =" + quantity+", Price = "+ price)
      case None =>
        println("Product ID " +productIdToCheck +"does not exist in inventory1.")
    }
  }
}
