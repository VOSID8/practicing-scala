/* Currying is the technique of transforming a fn
that takes multiple arguements into a function
that takes a single arguement
 */
object currying {

  def add(x:Int,y:Int) =x+y

  def add2 (x: Int)=(y: Int) => x+y;

  def add3(x:Int)(y:Int) =  x+y

  def main(args: Array[String]): Unit ={
    println(add(20,10))
    println(add2(20)(10))
    println(add3(20)(10))

    /* Ek value humne fn me di, ek call kerte waqt */
    val sum40= add2(40);
    println(sum40(100))

    val sum50 = add3(50)_
    println(sum50(400))

  }

}
