
object ValuesVarVal extends App {
  // VALS IMMUTABLE hote hain
  // COMPILER can infer types
  val x: Int = 42
  println(x)

  val aString: String = "hello"
  //; not zroori
  val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects helps us to see what program is doing
  // var is used for side effects
}