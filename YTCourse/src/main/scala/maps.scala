/*dictionary reee
two types
mutable nd immutable*/
object maps {

  val mymap : Map[Int, String] = Map(801 -> "max",802 ->"Tom",803->"Kyle")
  val mymap2 : Map[Int, String] = Map(805->"Uwu")
  def main(args: Array[String]): Unit ={
    println(mymap)
    println(mymap(801))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)

    mymap.keys.foreach { key=>
      println("key" + key)
      println("value "+mymap(key))
    }

    println(mymap.contains(801000))
    println(mymap ++ mymap2)
    println(mymap)
    println(mymap.size)

  }

}
