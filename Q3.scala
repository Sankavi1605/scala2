
 
 object Q3{
 
 def toUpper(input: String): String = {
    input.toUpperCase
  }

 def toLower(input: String): String = {
    input.toLowerCase
  }
  
  def formatNames(name: String, format: String => String): String = {
    format(name)
  }


  def main(args: Array[String]): Unit = {
    val benny = formatNames("Benny",toUpper)
    val niroshan = formatNames("Niroshan",name => name.take(2).toUpperCase + name.drop(2))
    val saman = formatNames("Saman",toLower)
    val kumara = formatNames("Kumara",name => name.take(name.length - 1) + name.last.toUpper)

    println(benny)      
    println(niroshan)  
    println(saman)     
    println(kumara)     
  }
}