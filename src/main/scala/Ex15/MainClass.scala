package Ex15
//15. Write a Scala program to find an element from the last position of a given list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8)

    println("Original List : " + lst)

    def Last_Nth_num[A](list: List[A], n: Int): A = {
      if (n <= 0) throw new IllegalArgumentException("Nth must be a positive")
      if (n > list.length) throw new NoSuchElementException("Nth position is greater than list")
      list.takeRight(n).head
    }

    println("3rd last ele of list : " + Last_Nth_num(lst, 2))
    println("5th last ele of list : " + Last_Nth_num(lst, 5))
  }
}
