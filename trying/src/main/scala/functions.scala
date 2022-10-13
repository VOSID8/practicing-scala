object functions {
  /*it is optional to write return, last line ko vo maan lega return */
  def add(x: Int,y: Int): Int={
    return x+y
  }
  def subtract(x: Int, y: Int): Int = {
    x - y
  }
  def multiply(x: Int, y: Int): Int = x*y

  /* you can also not declare Int cause it is certain int is return hoga */
  def divide(x: Int, y: Int)= x/y

  def main(args: Array[String]): Unit ={
    println(add(45,15))
    /* println(Math.add(45,15))
    println(Math square 4) */
    println(subtract(45,15))
    println(multiply(45,15))
    println(divide(45,15))
  }

}
