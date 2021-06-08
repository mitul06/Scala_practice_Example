package Ex22

//22. Write a Scala program to count the number of occurrences of each element in a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 2, 3, 4, 5, 6, 3, 4, 5, 6)
    val lst2 = List("red","blue","green","yellow","blue","red","yellow", "yellow")
    println(list_ele_occurences(lst1))
    println(list_ele_occurences(lst2))
  }

  def list_ele_occurences[A](list: List[A]): Map[A, Int] = {
    list.groupBy(e => e).map(m => (m._1, m._2.length))
  }
}
