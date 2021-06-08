package Ex8

//8. Write a Scala program to check a given list is empty or not.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List()
    val lst2 = List(1, 2, 3)

    println(lst1.isEmpty)
    println(lst2.isEmpty)
  }
}
