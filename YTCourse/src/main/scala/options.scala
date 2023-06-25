/*Scala options - (Some or None) */
object options {
  val lst = List(1,2,3)
  val map = Map(1->"Tom",2->"Max",3->"John")
  val opt: Option[Int] = Some(5)

  def main(args: Array[String]): Unit ={
    println(lst.find(_ > 2)); //returns Some(3)
    println(lst.find(_ > 2).get); //returns 3
    println(lst.find(_ > 5).getOrElse("No name found"))
  }
  println(opt.isEmpty)
  print(opt.get) //returns 5
  println(map.get(1))
  println(map.get(1).get)
  println(map.get(5).getOrElse("No Name found"))


}
