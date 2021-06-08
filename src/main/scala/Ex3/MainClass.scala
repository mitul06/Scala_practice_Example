package Ex3
//9879997360
import scala.collection.mutable.ListBuffer

//3. Write a Scala program to remove single and multiple elements from a given listbuffer/list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1,2,3,4,5,6)
    val lst2 = new ListBuffer[Int]()

    lst2 += 10
    lst2 += 11
    lst2 += 12
    lst2 += 13

    println(lst1)
    println(lst2)

    lst2 -= 13
    println(lst2)

    lst2 --= Seq(10,11)
    println(lst2.toList)  //

  }
}
