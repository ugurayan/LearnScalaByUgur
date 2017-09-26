package com.ugurayan.scala.tutorial_01


object tutorial01 {
  println("\n>>>>> TUTORIAL 01 : Basics -----------------------------------------\n")

  println("Hello, World !..")    // String printing

  println("Hello, " + "World" )  // Cascading strings by + operator

  print("Hello\n")
  print("World\n")

  println(2 + 3)

  println(2 + "3")

  println("12")

  println({ // Block expressions
    val x = 7 + 9
    x + 1
  })
}