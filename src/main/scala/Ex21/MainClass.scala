package Ex21
//21. Write a Scala program to check whether a list contains a sublist.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1,2,3)
    val lst2 = List(1,2,3,4,5)

    println(containsListEle(lst1,lst2))
    println(containsListEle(lst2,lst1))
  }
  def containsListEle[A](list1: List[A], list2: List[A]):Boolean ={
    list1.forall(list2.contains)
  }
}
