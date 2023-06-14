object mapfilter {
  val lst = List(1,2,3,4,5)
  val mymap = (1 -> "Tom",2 -> "Max",3 -> "Kyle")
  def main(args: Array[String]): Unit ={
    println(lst.map(x => x*2))
    println(lst.map(x => "hi" + x))
    println(lst.map(x => "hi"*x))
    /*println(mymap.mapValues(x => "hi" +x))*/
    println("hello".map(_.toUpper))
    println(List(List(1,2,3), List(3,4,5)))
    println(List(List(1,2,3), List(3,4,5)).flatten)
    println(lst.map(x => List(x,x+1)))
    println(lst.flatMap(x => List(x,x+1)))
    println(lst.filter(x => x%2==0))

  }
}
