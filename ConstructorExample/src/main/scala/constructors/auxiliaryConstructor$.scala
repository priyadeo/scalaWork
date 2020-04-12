object auxiliaryConstructor$ {
  class Employee(empId: Int,name: String,salary :Double){
     def this()
     {
       this(0,"",0.0)
       println("Zero-argument auxiliary constructor")
       }
     println("Primary construtor")
     }
  def main(args: Array[String]): Unit = {
    var auxEmp= new Employee()
    println(">>",auxEmp)
    val primaryEmp = new Employee(101,"Smith",50000)
    println("Primary>>",primaryEmp)
  }
}
