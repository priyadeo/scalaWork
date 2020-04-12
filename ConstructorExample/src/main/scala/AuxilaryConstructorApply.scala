/*
When you invoke more than one time this in the auxiliary constructor
then it will invoke apply() in the class,
 */
object AuxilaryConstructorApply extends App {

  var emp = new Point(12)

  class Point(x: Int, y: Int) {
    def this(x: Int) {
      this(x, 5)
      println("auxiliary constructor")
      this (x, 6)
      //it will invokes object's apply method like this.apply(x,6).
    }

    def apply(x: Int, y: Int) = println(s" x= $x and y = $y")
  }

}

/*
The following shows error as multiple this and no apply given
class Point(x: Int,y: Int) {
 def this(x: Int) {
 this(x,5)
 println("auxiliary constructor")
 this(x,5)
 }
 }
 */