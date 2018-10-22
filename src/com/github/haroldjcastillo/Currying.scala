package com.github.haroldjcastillo

/**
 * Currying is the technique of transforming a function that takes multiple arguments into a function that takes a single argument
 *
 * @author harold.castillo
 */
object Currying {

  def main(args: Array[String]): Unit = {
    println(s"Simple call:x ${add(20, 10)}")
    println(s"Currying: ${add(20)(10)}")

    val addCurrying = add(20)
    println(s"Currying variable: ${addCurrying(10)}")
    
    println(s"Currying subtract: ${subtract(100)(30)}")
    val sub = subtract(100)_
    println(s"Currying subtract: ${sub(50)}")
  }

  def add(x: Int, y: Int) = x + y
  def add(x: Int) = (y: Int) => x + y
  def subtract(x: Int)(y: Int) = x - y
}