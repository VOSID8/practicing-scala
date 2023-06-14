object strings {

  val str1 : String = "hello world"
  val str2 : String = "Max"
  val num1 = 75
  val num2 =  100.25
  def main(args: Array[String]): Unit ={
    println(str1.length());
    println(str1.concat(str2))
    println(str1 + str2)

    val result = printf("(%d -- %f -- %s)",num1,num2,str1)
    println(result)
    /* When we used printf esse hii then it works,
    else we are calling a function so yeah
     */
    println("(%d -- %f -- %s)".format(num1,num2,str1))
    printf("(%d -- %f -- %s)",num1,num2,str1)

  }


}
