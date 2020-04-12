class MathOperation(firstVal: Int, secondVal: Int) {
  def sum(): Int = firstVal + secondVal

  def multiply(x: Int, y: Int, z: Int): Int = x * y * z
}

object testClass {
  def main(args: Array[String]): Unit = {
    val mathOp = new MathOperation(5, 10)
    var s = mathOp.sum()
    var m = mathOp.multiply(3, 4, 2)
    // check the parameter lists just above,its not using constructor parameters rather method call parameters
    println("s>>", s, "mul>>", m)
  }
}