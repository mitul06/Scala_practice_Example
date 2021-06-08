package Ex24

//24. Write a Scala program to calculate the length of a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6)

    val lst1 = List(1, List(1, 2, 3), 4)
    println(lst.length)
    println(lst1.length)
  }
}
