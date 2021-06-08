package Ex20

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst = List(1,2,3,4,5,6,7)

    println("Original : " +lst)
    println("After : "+n_times_dupicates(lst,3))
    println("After : "+n_times_dupicates(lst,4))
    println("After : "+n_times_dupicates(lst,2))
  }

  def n_times_dupicates[A](list: List[A], n:Int):List[A] = {
    list flatMap(e => List.fill(n)(e))
  }
}
