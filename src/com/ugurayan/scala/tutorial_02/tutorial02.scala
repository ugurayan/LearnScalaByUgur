package com.ugurayan.scala.tutorial_02

/**
  * Created by future on 9/20/17.
  */
object tutorial02 {

  val x: Long = 987654321
  val y: Float = x  // 9.8765434E8 (note that some precision is lost in this case)

  val face: Char = '☺'
  val number: Int = face  // 9786


  val list: List[Any] = List(
    "a string",
    1453,   // an integer
    'x',   // a character
    true,   // a boolean value
    () => "an anonymous function returning a string"
  )

  println("\n>>>>> TUTORIAL 02 : Variables/ Unified TYpes ----------------------------\n")

  list.foreach(element => println(element))

}
