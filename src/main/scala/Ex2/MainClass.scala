package Ex2

import scala.collection.mutable.ListBuffer

//2. Write a Scala program to add single element and multiple elements to a given listbuffer/list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = new ListBuffer[Int]()

    lst1 += 1  //single
    lst1 += 2
    lst1 += 3
    lst1 += 4

    lst1 ++= List(5,6,7) //multiple

    val lst2 = lst1.toList
    println(lst1)
    println(lst2)
  }
}
