package Ex11

//11. Write a Scala program to find the index of an element in a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5)
    println("Index of List ele : "+lst.indexOf(5))
  }
}
