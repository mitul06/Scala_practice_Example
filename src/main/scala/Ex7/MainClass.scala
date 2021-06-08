package Ex7

//7. Write a Scala program to remove duplicates from a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 2, 3, 4, 8, 9, 0)

    println("Remove Duplicates From List : " + lst.distinct)
    println("Remove Duplicates From List : " + lst.toSet)
  }
}
