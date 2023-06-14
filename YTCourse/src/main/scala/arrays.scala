import Array._
object arrays {

  val myarray1: Array[Int] = new Array[Int](4)
  val myarray2 = new Array[Int](5)
  val myarray3 = Array(1,2,3,45,66)

  def main(args: Array[String]): Unit ={
    myarray1(0) = 20
    myarray1(1) = 50
    myarray1(2) = 10
    myarray1(3) = 30
    println(myarray1)
    println(myarray3.length)
    val result = concat(myarray1,myarray3)
    for(x <- result){
      println(x)
    }

    for(i <- 0 to (myarray1.length -1)){
      println(myarray1(i))
    }
  }

}
