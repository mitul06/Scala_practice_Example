package Ex23

//23. Write a Scala program to split a given list into two lists.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8)

    println(split_lst(lst, 3))
    println(lst.splitAt(3))
    val lst1 = lst.slice(0, 3)
    val lst2 = lst.slice(3, 9)
    println(lst1)
    println(lst2)
  }

  def split_lst[A](list: List[A], n: Int): (List[A], List[A]) = {
    (list.take(n), list.drop(n))
  }
}
