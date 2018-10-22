package com.github.haroldjcastillo

/**
 * Sets are immutable
 * 
 * @author harold.castillo
 */
object SetDemo {

  val someSet: Set[Int] = Set(1, 2, 3, 4, 5, 5, 6)
  val otherSet: Set[String] = Set("Max", "Tom", "Jhon", "Peter", "Sara")
  val anotherSet: Set[Int] = Set(5, 7, 8, 9, 10, 10, 9)

  def main(args: Array[String]): Unit = {
    println(someSet)
    println(otherSet)
    println(anotherSet)
    
    // add a value into the set
    println(someSet + 10)
    
    // if a value it's present in the set
    println(someSet(5))
    
    // head and tail 
    println("Head: " + someSet.head + " Tail: " + someSet.tail)
    
    // Concatenate two sets
    println(someSet ++ anotherSet)
    println(someSet.++(anotherSet))
    
    // Intercepting 
    println(someSet & anotherSet)
    println(someSet.intersect(anotherSet))
    
    someSet.foreach(println)
    
    for(name <- otherSet) {
      print(s"$name ")
    }
  }

}