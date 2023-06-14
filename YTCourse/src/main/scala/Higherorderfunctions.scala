object Higherorderfunctions {

  def math(x: Double, y:Double, f:(Double,Double)=>Double): Double = f(x,y)
  def math2(x: Double, y:Double, z:Double, f:(Double,Double)=>Double): Double = f(f(x,y),z)


  def main(args: Array[String]): Unit ={
    val result = math(50,20,(x,y)=>x+y)
    println(result)
    val result2 = math(50,20,(x,y)=>x*y)
    println(result2)
    /* x max y gives us the max */
    val result3 = math(50,20,(x,y)=>x max y)
    println(result3)
    val result4 = math2(50,20,10,(x,y)=>x+y)
    println(result4)
    /* let us use wild cards */
    val result5 = math2(50, 20, 10, _+_)
    println(result5)
    val result6 = math2(50, 20, 10, _ max _)
    println(result6)


  }

}
