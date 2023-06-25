object tuples {
  val mytuple = (1,2,"hello",true,(4,5));
  val mytuple2 = new Tuple3(1,2,"hello")
  /* This is wrong now
  val mytuple3 = new Tuple3(1,2)
  becaues Tuple3 means tuple me 3 elements
  this goes till Tuple22
   */
  def main(args: Array[String]): Unit ={
    println(mytuple)
    println(mytuple._2) //returns 2
    println(mytuple._4)
    println(mytuple._3)
    mytuple.productIterator.foreach{
      i => println(i)
    }
    println(1 -> "Tom" -> true)
    println(mytuple._5._2); //hmm great
  }

}
