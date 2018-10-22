package com.github.haroldjcastillo

object MapDemo {
  
  val someMap : Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "Jhon", 804 -> "Peter", 805 -> "Sara");
  
  def main(args: Array[String]): Unit = {
    println(someMap)
    
    // Get value by the key
    println(someMap(802))
    
    println(someMap.keys)
    println(someMap.values)
    println(someMap.isEmpty)

    // for loop
    someMap.keys.foreach { key =>
      println("key: " + key+ " value: " + someMap(key));
    }
  }
}