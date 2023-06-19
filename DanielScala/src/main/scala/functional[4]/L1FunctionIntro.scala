object L1FunctionIntro extends App {
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))
  val StringToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }
  println(StringToIntConverter("3") + 4)
  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  //val adder = new Function2[Int, Int, Int] 
  /*
  1. a function which takes 2 strings and concatenates them
  2. transform the MyPredicate and MyTransformer into function types
  3. define a function which takes an int and returns another function which takes an int and returns an int
    - what's the type of this function
    - how to do it
   */
  def Concatenator: (String,String) => String = new Function2[String,String,String]{
    override def apply(a: String, b: String): String = a + b
  }
  println(Concatenator("Hello","Scala"))
  def superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]]{
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int]{
      override def apply(y: Int): Int = x + y
    }
  }
}

trait MyFunction[A, B] {
  def apply(element: A): B
}

class Action{
    def execute(): Unit = {
        println("Action executed")
    }
}
