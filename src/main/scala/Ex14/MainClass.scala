package Ex14


//14. Write a Scala program to find the nth element of a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8)

    println("Original List : " + lst)

    def Nth_num[A](list: List[A], n: Int): A = {
      if (n < 0) throw new IllegalArgumentException("Nth must be a positive")
      if (n > list.length) throw new NoSuchElementException("Nth position is greater than list")
      list(n)
    }

    println("3rd ele of list : " + Nth_num(lst, 2))
    println("5th ele of list : " + Nth_num(lst, 5))
//    println("5th ele of list : " + Nth_num(lst, -1))
//    println("5th ele of list : " + Nth_num(lst, 9))

  }
}
