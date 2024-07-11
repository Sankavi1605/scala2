object Q1 {
  val itemNames = Array("Book", "Pen", "Orange", "Apple")
  val itemQuantities = Array(40, 10, 20, 30)

  def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
     println("list of the inventory items names and quantity ")
    for(i <- itemNames.indices)
      {
          println(itemNames(i) +" : " + itemQuantities(i) + "\n")

      }
    }

  def restockItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println("Restocked" +itemName +".New quantity:" +itemQuantities(index))
    } else {
      println("Item"+itemName+ "does not exist in the inventory.")
    }
  }

  def sellItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println("Sold " +quantity +" of "+itemName+". Remaining quantity:" +itemQuantities(index))
      } else {
        println("Not enough quantity of "+ itemName +" to sell.Available quantity:" +itemQuantities(index))
      }
    } else {
      println("Item "+itemName+" does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory(itemNames, itemQuantities)
    restockItem(itemNames, itemQuantities, "Book", 10)
    sellItem(itemNames, itemQuantities, "Pen", 5)
    sellItem(itemNames, itemQuantities, "Orange", 25)
    displayInventory(itemNames, itemQuantities)
  }
}
