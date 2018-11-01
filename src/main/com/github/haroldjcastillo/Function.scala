package com.github.haroldjcastillo

import scala.collection.Map
import java.lang.Math;

/**
 * @author harold.castillo
 */
object Function {

  object Math {

    def add(z: Int*): Int = {
      var w: Int = 0
      z.foreach(w += _)
      w
    }

    def +(z: Int*): Int = {
      var w: Int = 0
      z.foreach(w += _)
      w
    }

    def sqrt(v: Double): Double = java.lang.Math.sqrt(v);
  }

  def main(args: Array[String]): Unit = {
    println("Function add called from an object: " + Math.add(1, 2, 3, 4, 5))
    println("Function + called from an object: " + (Math + 1, 2, 3, 4, 5))
    println("Function add: " + add(1, 2, 3, 4, 5))
    println("Function substract: " + substract(4, 5))
    println("Function divide: " + divide(5000, 2))
    println("Function divide deafult: " + divide())
    println("Function divide take first value: " + divide(5))
    println("Function divide taking second value: " + divide(z = 2))
    println("Function multiply: " + multiply(1, 2, 3, 4, 5))
    println("Function sqrt called from an object: " + (Math sqrt 4))
   
    var sum = (x : Int, y : Int)  => {
      x + y
    }
    println("Anonimoius function: " + sum(4, 2))
  }

  def add(z: Int*): Int = {
    var w: Int = 0
    z.foreach(w += _)
    w
  }

  def substract(x: Int, y: Int): Int = x - y;

  def divide(w: Int = 1, z: Int = 1): Double = {
    w / z
  }

  def multiply(z: Int*): Int = {
    var w: Int = 0
    z.foreach(w *= _)
    w
  }

}