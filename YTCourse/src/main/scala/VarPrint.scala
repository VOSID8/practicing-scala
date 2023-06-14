object VarPrint {
  def main(args: Array[String]) = {
    val name = "mark"
    val age = 18
    println(name + " is " + age + " years old ")
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old") /*f string interpolation */
    println(s"Hello \nworld")
    println(raw"Hellow \nworld")
  }
}
