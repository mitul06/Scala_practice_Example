package Ex13

//13. Write a Scala program to find the even and odd numbers from a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val Even_Nums = lst.filter(_ % 2 == 0)
    val Odd_Nums = lst.filter(_ % 2 != 0)

    println("Even Nums : " + Even_Nums)
    println("Odd Nums : " + Odd_Nums)
  }
}
