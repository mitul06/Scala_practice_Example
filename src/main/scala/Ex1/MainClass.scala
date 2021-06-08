package Ex1

//1. Write a Scala program to create a list in different ways.


object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1,2,3,4,5,6)
    val lst2 = List("Mitul", "Dhrupal","Harshil")
    val lst3 = List(1,"Mitul",2,"Daksh",3,'A')
    val lst4 = List(lst1,lst2,lst3)
    val lst5 = 1::(2::("Mitul"::(true::Nil)))

    println(lst1)
    println(lst2)
    println(lst3)
    println(lst4)
    println(lst5)

    println(lst1.head)
    println(lst2.tail)
    println(lst3.isEmpty)
    println(lst2:::lst3)
    println(lst1.:::(lst2))
    println(lst2.concat("Yash"))

    val lst6 = List.fill(5)(2)
    val lst7 = List.tabulate(7)(n => n*2)
    val lst8 = List.tabulate(3,7)(_*_)

    println(lst6)
    println(lst7)
    println(lst8)
  }
}
