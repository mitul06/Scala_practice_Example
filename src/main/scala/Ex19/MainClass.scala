package Ex19

//19. Write a Scala program to triplicate each element immediately next to the given list of integers.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 2, 3, 4, 5, 6, 7)
    println("original : " + lst1)
    println("After triplicate : " + duplicate(lst1))

  }

  def duplicate[A](list: List[A]): List[A] = {
    list flatMap (e => List(e, e, e))
  }
}
