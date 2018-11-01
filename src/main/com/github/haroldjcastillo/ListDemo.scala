package com.github.haroldjcastillo

/**
 * Lists are immutable
 *
 * @author harold.castillo
 */
object ListDemo {

  val someList: List[Int] = List(1, 2, 3, 4, 5);
  val otherList: List[String] = List("Max", "Tom", "Jhon", "Peter", "Sara");

  def main(args: Array[String]): Unit = {
    // add values to the first of a list
    println(0 :: someList)
    println(someList)
    println(otherList)
    // Empty list
    println(1 :: 2 :: 3 :: Nil)
    // Head and Tail
    println(otherList.head)
    println(otherList.tail)
    // Empty
    println(otherList.isEmpty)
    // Reverse
    println(otherList.reverse)
    // Fill a list with 5 values of 2
    println(List.fill(5)(2))
    
    iteration(someList)
    iteration(otherList)
    
    sum(someList)
  }
  
  def iteration(someList : List[Any]) {
    someList.foreach(print)
    println()
  }
  
  def sum(list: List[Int]) {
    var sum: Int = 0
    list.foreach(sum += _)
    println(sum)
  }
}