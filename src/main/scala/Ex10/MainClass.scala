package Ex10

//10. Write a Scala program to find the first and last element of given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6)
    println("First : "+lst.head)
    println("Last : "+lst.last)
  }
}
