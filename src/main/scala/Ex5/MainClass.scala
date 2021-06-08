package Ex5

//5. Write a Scala program to iterate over a list to print the elements and calculate the sum and product of all elements of this list.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 2, 3, 4,5)
    for (i <- lst1) {
      println("lst : " + i)
    }

    println("Sum of List : " + lst1.sum)
    println("Product of List : " + lst1.product)
  }
}
