package com.github.haroldjcastillo

import java.util.Date

/**
 * @author harold.castillo
 */
object PartiallyAppliedFunctions {

  def log(date: Date, message: String) = {
    println(s"[$date] : $message")
  } 
  
  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c;
    val f = sum(10, _: Int, _: Int)
    println(f(20, 30))
    
    val date = new Date;
    val newLog = log(date, _: String)
    for(i <- 1.to(3))
      newLog(s"This is the message $i")
  }
}