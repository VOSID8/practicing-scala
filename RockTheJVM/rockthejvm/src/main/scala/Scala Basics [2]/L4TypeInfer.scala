object L4TypeInfer extends App {
  
    val message = "Hello, Scala!" // type inference

    //val x = 42  type inference
    val x: Int = 42 // type annotation
 
    val y = x + "hello" // y: String = 2hello

    def succ(x: Int) = x + 1 // return type is Int

    def factorial(n: Int): Int = // return type is Int
        if (n <= 0) 1 else n * factorial(n - 1)
}
