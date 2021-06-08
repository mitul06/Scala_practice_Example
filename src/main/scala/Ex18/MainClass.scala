package Ex18

//18. Write a Scala program to flatten a given List of Lists, nested list structure.

object MainClass {
  def main(args: Array[String]): Unit = {

    val lst1 = List(1, 2, 3)
    val lst2 = List(3, 4)
    val lst3 = List(List(5, 6), List(7, 8), 9)
    val lst4 = List(lst1, lst2, lst3)

    println(flattenMathod(lst3))
    println(flattenMathod(lst4))
    println(lst4.flatten)

  }

  def flattenMathod(list: List[_]): List[Any] = list match {
    case Nil => Nil
    case (head: List[_]) :: tail => flattenMathod(head) ::: flattenMathod(tail)
    case head :: tail => head :: flattenMathod(tail)
  }
}
