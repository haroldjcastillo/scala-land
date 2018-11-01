package com.github.haroldjcastillo

/**
 * Tuples are immutable the size it's fixed
 * 
 * @author harold.castillo
 */
object TupleDemo {
  
  val someTuple = (1,2, "hello", true, 5.0)
  val otherTuple = new Tuple5(1,2, "hello", true, 5.0)
  val anotherTuple = new Tuple2("hello", ("world", 2018))
  
  def main(args: Array[String]): Unit = {
    println(someTuple._5)
    
    otherTuple.productIterator.foreach {
      i => print(s"$i ")
      println()
    }
    
    // Only valid for 2 values the arrow "->" crates a new tuple
    println(1 -> "Tomee")
    
    println(anotherTuple._1 + " " + anotherTuple._2._1 + " in " + anotherTuple._2._2)
  }
}