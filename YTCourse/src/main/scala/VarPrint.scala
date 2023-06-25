object VarPrint {
  def main(args: Array[String]) = {
    val name = "mark"
    val age = 18
    println(name + " is " + age + " years old ")
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old") /*f string interpolation */
    //Result: mark is 18 years old
    println(s"Hello \nworld")
    println(raw"Hellow \nworld")
  }
}
