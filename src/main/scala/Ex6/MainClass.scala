package Ex6

//6. Write a Scala program to find the largest and smallest number from a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8)

    println("Smallest Num of List : " + lst.min)
    println("Largest Num of List : " + lst.max)
  }
}
