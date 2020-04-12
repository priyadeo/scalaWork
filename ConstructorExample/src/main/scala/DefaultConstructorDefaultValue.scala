object DefaultConstructorDefaultValue {

  def main(args: Array[String]): Unit = {
    val emp = new Employee()
    val emp1 = new Employee(name = "Smith", empId = 9)
    //    val emp1 = new Employee(name = "Smith", empIf = 9)  throws error with wrong name
    println(emp, "\n", emp1)
  }

  class Employee(empId: Int = 0, name: String = "", salary: Double = 0.0) {
    println(s"empId = $empId , empName = $name , salary = $salary")
  }

}
