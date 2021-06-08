package Ex9

//9. Write a Scala program to get the difference between two given lists.

object MainClass {
  def main(args: Array[String]): Unit = {

    val lst1 = List(1, 2, 3, 4, 5)
    val lst2 = List(2, 6, 7, 8, 9)

    println("Original lst1 : " + lst1)
    println("Original lst2 : " + lst2)

    val temp = lst2.toSet
    val result = lst1.filterNot(temp)
    println("Resulted lst 1 : " + result)

    val temp1 = lst1.toSet
    val result1 = lst2.filterNot(temp1)
    println("Resulted lst 2 : " + result1)
  }
}
