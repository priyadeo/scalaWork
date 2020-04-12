object PrimaryConstructors {
  def main(args: Array[String]): Unit = {
    var emp1 = new Employee //Without braces or parameters
    var emp2 = new Employee() //With brances
    println("employee ", emp1, emp2)
  }

  class Employee {
    println(" Constructor body ")
  }

}
