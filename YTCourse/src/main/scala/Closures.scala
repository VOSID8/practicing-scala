import java.util.Date
/* A closure is a fn which uses
one or more variables declared outside this function
 */
object Closures {

  var number=10;
  val number2=20
  println(number)
  /* when it is var, number can be changed
  it is called impure closure
  and val fixes it, it is pure closure
   */
  val add = (x :Int) => x +number;

  def main(args: Array[String]): Unit ={
    number=100
    /*clorsure will take the most recent one */
    println(add(20))

  }

}
