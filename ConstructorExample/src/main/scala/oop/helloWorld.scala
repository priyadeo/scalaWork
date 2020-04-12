package oop

object helloWorld {
  def main(args: Array[String]): Unit = { //return type is unit not void like java
    println("Hulla Wurlda")

  }
  def main(): Unit = {
    println("Ding dong")
  }
  println("Here I am")
  var test = helloWorld.main()
  var testMain = helloWorld.main(Array(""))
}
