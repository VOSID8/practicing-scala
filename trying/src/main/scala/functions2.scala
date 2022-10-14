object functions2 {
  /*it is optional to write return, last line ko vo maan lega return */
  def +(x: Int,y: Int): Int={
    return x+y
  }
  def **(x: Int)= x*x
  /* yes we can do this thing here, it is not fucntion overloading but just the declaration = */

  /*Like void in other langs, when a function does not return anything we add Unit */
  def print(x: Int,y: Int): Unit={
    println(x+y)
  }

  def main(args: Array[String]): Unit ={

    /*how to declare anon functon */
    var add = (x : Int,y : Int) => x+y;
    println(add(200,300))
    print(100,200)
    println(functions2.+(60,15))
    println(functions2 ** 3)
  }

}
