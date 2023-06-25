import scala.annotation.tailrec
import scala.util.Random


object L3HOFsAndCurries extends App {

  val superFunction: (Int,(String,(Int => Boolean)) => Int) => (Int => Int) = null
  // higher order function (HOF), returns a function

  //map filter flatMap are HOFs
  //function that applies to another function n times

  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n-1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  //nTimesBetter(f,n) = x => f(f(f...(x)))

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x //identity function
    else (x: Int) => nTimesBetter(f, n-1)(f(x))
  //nTimesBetter(f, n-1) returns a function, so we can apply it to f(x)
  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))
  //Here, we are returning a function that applies f n times (n-1) each time
  //and then applies f to x (the last time)
  //this is better than the previous function because we are not using recursion in the last step
  //we are just applying the function to x (the last time) and not calling the function again
  //this is called currying (functions with multiple parameter lists)
  //currying is a special case of HOFs (functions that return functions)
  //this is good as we can use the same function for different values of n
   

  //curried functions
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val adder: (Int,Int) => Int = (x: Int, y: Int) => x + y
  val adder2 = (x: Int, y: Int) => x + y //here the compiler knows the type of the function
  //the compiler can infer the type of the function
  val hello: String => Int = (name: String) => size(name) 
  val add3 = superAdder(3) //y => 3 + y //curried function
  println(add3(10))
  println(superAdder(3)(10)) //curried function

  //functions with multiple parameter lists
  def curriedFormatter(c: String)(x: Double): String = c.format(x)
  //c is a parameter list, x is another parameter list
  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

  /* 
    
  */

   
}
