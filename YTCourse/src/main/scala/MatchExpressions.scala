object MatchExpressions {
  def main(args: Array[String]): Unit ={
    val age= 20;

    age match{
      case 20 => println(age)
      case 18 => println(age)
      case 28 => println(age)
      case 40 => println(age)
      case 50 => println(age)
      /* lets catch default case */
      case _=> println("default")
    }
    val result = age match {
      case 20 => age
      case 18 => age
      case 28 => age
      case 40 => age
      case 50 => age
      /* lets catch default case */
      case _ => println("default")
    }
    println("result ="+result)

    val i=2
    i match{
      case 1 | 3 | 5 => println("hi")
      case 2 | 4 | 6 => println("bye")
    }
  }
}
