package Ex12

//12. Write a Scala program to merge (concatenate) given lists.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 2, 3)
    val lst2 = List(4, 5, 6)

    val lst3 = lst1.:::(lst2)
    val lst4 = lst1.concat(lst2)
    println(lst3)
    println(lst4)
  }
}
