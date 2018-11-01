package com.github.haroldjcastillo

/**
 * Options (some or none)
 *
 * @author harold.castillo
 */
object OptionDemo {

  val somList = List(1, 2, 3, 4, 5)
  val someMap : Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "Jhon", 804 -> "Peter", 805 -> "Sara");

  var opt : Option[Int] = None
  
  def main(args: Array[String]): Unit = {
    println(somList.find(_ > 6).getOrElse(null))
    println(somList.find(_ > 3).get)
    
    println(someMap.get(1).getOrElse(null))
    println(someMap.get(801).get)
    
    println(opt.isEmpty)
    opt = Some(55)
    println(opt.isEmpty)
  }
}