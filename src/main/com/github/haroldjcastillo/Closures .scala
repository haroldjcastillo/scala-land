package com.github.haroldjcastillo

/**
 * A closure is a function which uses one or more variables declared outside this function.
 *
 * @author harold.castillo
 */
object Closures {

  /**
   * Variable to use in the function add
   */
  var number = 10;
  val other = 5;
  
  val add = (x: Int) => {
    number = x + number + other
    number
  };

  def main(args: Array[String]): Unit = {
    println(s"when number it's $number adding 20 = ${add(20)}")
    println(s"when number it's $number adding 20 = ${add(20)}")
  }
}