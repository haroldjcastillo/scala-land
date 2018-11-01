package com.github.haroldjcastillo

object StringInterpolation {

  def main(args: Array[String]): Unit = {
    val name = "mark"
    val age = 18.5
    println(name + " is " + age + " years old")
    println(s"$name is $age%d years old")
    println(f"$name%s is $age%.2f years old")
    println(s"Hello \nworld")
    println(raw"Hello \nworld")
  }

}