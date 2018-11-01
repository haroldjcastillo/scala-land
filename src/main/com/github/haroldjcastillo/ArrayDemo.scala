package com.github.haroldjcastillo

import java.time.LocalDateTime

/**
 * Arrays are mutable
 * @author harold.castillo
 */
object ArrayDemo {

  val someArray: Array[Int] = new Array[Int](5)
  val otherArray = new Array[Int](5)
  val anotherArray = Array(1, 2, 3, 4, 5, 6)

  def main(args: Array[String]): Unit = {
    for (i <- 0 to 4) {
      someArray(i) = i + 1
    }
    log(someArray)
    log(otherArray)
    log(anotherArray)
    
    val concatArrays = Array.concat(someArray, otherArray)
    log(concatArrays)
  }

  def log(array: Array[Int]): Unit = {
    for (i <- array) {
      println(log(String.valueOf(i)))
    }
    println()
  }

  def log(message: String): String = {
    val dateTime = LocalDateTime.now();
    s"[$dateTime] : $message"
  }

}