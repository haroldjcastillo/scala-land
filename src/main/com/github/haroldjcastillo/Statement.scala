package com.github.haroldjcastillo

object Statement {

  def main(args: Array[String]): Unit = {
    // elseIf(20, 30)
    //whileLoop()
    forLoop()
  }

  def elseIf(x: Int, y: Int): Unit = {
    var res = ""

    if (x == 20 && y == 30) {
      res = s"x it's equal to $x and y it's equal to $y"
    } else {
      res = s"x it's not equal to $x and y it's not equal to $y"
    }
    println(res)
    println(if (x != 20) s"x it's equal to $x" else s"x it's not equal to $x")
  }

  def whileLoop(): Unit = {
    var x = 0

    println("while loop")
    while (x < 10) {
      println(s"x = $x")
      x += 1
    }

    println(s"\ndo while loop")
    do {
      println(s"x = $x")
      x += 1
    } while (x < 20)

  }

  def forLoop(): Unit = {

    for (i <- 1.to(3)) {
      println(s"i using to $i")
    }

    for (i <- 1.until(3)) {
      println(s"i using until $i")
    }

    for (i <- 1 to 3; j <- 1 to 2) {
      println(s"i using to $i $j")
    }

    var lst = List(1, 2, 3, 4)
    for (i <- lst) {
      println(s"i using List $i")
    }

    for (i <- lst; if i < 3) {
      println(s"i using Filter $i")
    }

    val result = for { i <- lst; if i < 3 } yield {
      i * i
    }
    println(s"result = $result")
  }

}