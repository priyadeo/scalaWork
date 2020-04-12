package oop

/*
There is no static key word in scala
to make one, create an object with same name as class which is the companion object
we can create as many static methods as required with that
 */
/*
By default object reference is returned as an address.
To format it override the toString method with your own formatting
 */
/*
Apply method is a static method.
Companion objects static methods can be accessed with new keyword or just with the apply method
 */
object companionObject {
  class Order(var orderId:Int,var orderDate:String){
    override def toString="(OrderId:"+orderId+"orderDate:" +orderDate+")"
    println("inside Order constructor")
  }
//  Companion object
object Order{
  def apply(orderId: Int, orderDate: String): Order = new Order(orderId, orderDate)
}

  def main(args: Array[String]): Unit = {
//    println(toString (companionObject.Order(10232,"12-April-2020")))
    var o=Order.apply(2979,"12-April-2020")
    println("order",o)
  }

}
