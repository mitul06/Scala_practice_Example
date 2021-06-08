package Ex4

import scala.collection.mutable.ListBuffer
//4. Write a Scala program to delete element(s) from a given List.

object MainClass {
  def main(args: Array[String]): Unit = {

    val lst1 = List(1,2,3,4,5)
    println(lst1)

    val lst2 = lst1.filter(_>3)
    println(lst2)

    val lst3 = new ListBuffer[Int]()
    lst3 += 1
    lst3 += 2
    lst3 += 3
    lst3 += 4

    println(lst3.toList)
    lst3.remove(3)
    println(lst3.toList)
  }
}
