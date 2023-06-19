object Anonfn extends App {
  val doubler = new Function1[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  val justDoSomething: () => Int = () => 3

  println(justDoSomething) // function itself
  println(justDoSomething()) // call

  val stringToInt = { (str: String) =>
    str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b

  /*
  1. MyList: replace all FunctionX calls with lambdas
  2. Rewrite the "special" adder as an anonymous function
   */

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
  
}
