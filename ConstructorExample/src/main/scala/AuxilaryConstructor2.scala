/*
Multiple auxilary constructors
when we create an instance with the help of zero arguments auxiliary constructor.
Zero argument constructor call to One argument auxiliary constructor
and One argument constructor to a Primary constructor. So the primary constructor body
would execute first then after one argument constructor body then after zero arguments.
 */
object AuxilaryConstructor2 {
  def main(args: Array[String]): Unit = {
    var emp = new Employee()
    println("employee>>", emp)
  }

  class Employee(empId: Int, name: String, salary: Double) {
    def this(empId: Int, name: String) {
      this(0, "", 0.0) // here it invokes primary constructor.
      println("Two-argument auxiliary constructor")
    }

    def this(empId: Int) {
      this(0, "", 0.0) // here it invokes primary constructor.
      println("One-argument auxiliary constructor")
    }

    def this() {
      this(0) // here it invokes one-argument auxiliary constructor.
      println("Zero-argument auxiliary constructor")
    }

    println("Primary construtor")
  }

}
