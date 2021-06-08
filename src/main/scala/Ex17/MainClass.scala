package Ex17
//17. Write a Scala program to check a given list is a palindrome or not.

object MainClass {
  def main(args: Array[String]): Unit = {
    val lst1 = List(1,2,3,4,3,2,1)
    val lst2 = List(1,2,3,4)

    println(isPalindrome(lst1))
    println(isPalindrome(lst2))
  }

  def isPalindrome[A](list: List[A]) : Boolean ={
    list == list.reverse
  }
}
