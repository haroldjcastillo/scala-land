package com.github.haroldjcastillo

object MatchExpression {

  def main(args: Array[String]): Unit = {
    // caseMatching()
    caseMatching(30)
  }

  def caseMatching(): Unit = {
    var age = 20;

    val result = age match {
      case 20 => s"age it's equal to $age"
      case 30 => s"age it's equal to $age"
      case 40 => s"age it's equal to $age"
      case 50 => s"age it's equal to $age"
      case 60 => s"age it's equal to $age"
      case 70 => s"age it's equal to $age"
      case _  => println(s"age doesn't match with $age")
    }

    println(s"age it's equal to $age")
    assert(result.equals(s"age it's equal to $age"))
  }

  def caseMatching(age: Int): Unit = {

    val result = age match {
      case 20 | 30 | 40 | 50 | 60 | 70 => s"age it's equal to $age"
      case _ => println(s"age doesn't match with $age")
    }
    println(s"age it's equal to $age")
    assert(result.equals(s"age it's equal to $age"))
  }
}