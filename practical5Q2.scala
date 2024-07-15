import scala.collection.mutable.Set

object Q2 {

  // Define the Book case class
  case class Book(title: String, author: String, isbn: String)

  // Initialize the library with three books
  var library: Set[Book] = Set(
    Book("The Dark Room", "Narayan", "12415124"),
    Book("Ignited Minds", "APJ Abdul Kalam", "3421351"),
    Book("The Golden Gate", "Vikram Seth", "77771111")
  )

  // Function to add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
  }

  // Function to remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  // Function to check if a book is in the library by its ISBN
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Function to display the current library collection
  def displayLibrary(): Unit = {
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  // Function to search for a book by its title
  def searchBookByTitle(title: String): Option[Book] = {
    library.find(_.title.equalsIgnoreCase(title))
  }

  // Function to display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    library.filter(_.author.equalsIgnoreCase(author)).foreach { book =>
      println(s"Title: ${book.title}, ISBN: ${book.isbn}")
    }
  }

  // Main function to test the library management system
  def main(args: Array[String]): Unit = {
    // Add a new book
    addBook(Book("Brave New World", "Aldous Huxley", "6677889900"))

    // Remove a book
    removeBook("12415124") // Removing the book "The Dark Room"

    // Check if a book is in the library
    println(isBookInLibrary("3421351"))  

    // Display the library
    displayLibrary()

    // Search for a book by title
    val searchResult = searchBookByTitle("Ignited Minds")
    searchResult match {
      case Some(book) => println(s"Found book: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None => println("Book not found")
    }

    // Display all books by a specific author
    displayBooksByAuthor("Vikram Seth")
  }
}
