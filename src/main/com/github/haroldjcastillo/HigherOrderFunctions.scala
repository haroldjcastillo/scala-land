package com.github.haroldjcastillo

/**
 * @author harold.castillo
 */
object HigherOrderFunctions {

  def main(args: Array[String]): Unit = {

    var fun = (x: Double, y: Double) => {
      x + y
    }
    var result = math(50, 50, fun);
    println("add: " + result)
    result = math(60, 60, (x, y) => x * y);
    println("multiply: " + result)
    result = math(60, 10, (x, y) => x min y);
    println("min: " + result)

    result = math(60, 10, 50, (x, y) => x + y);
    println("add: " + result)
    result = math(60, 10, 50, _ max _);
    println("max: " + result)
  }

  def math(x: Double, y: Double, fun: (Double, Double) => Double): Double = fun(x, y);
  def math(x: Double, y: Double, z: Double, fun: (Double, Double) => Double): Double = fun(fun(x, y), z);
}