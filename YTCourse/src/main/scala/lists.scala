import Array._
/* Arrays are mutable and
lists are immutable, works as linkedlist
 arrays are flat*/
object lists {

  val mylist: List[Int] = List(1,2,3,4,5,6)
  val names: List[String] = List("Max","Tom","John")
  def main(args: Array[String]): Unit ={
    println(mylist)
    println(names)

    /*prepend hojaega 0 BUT MYLIST CHANGE NHI HOGI*/
    println(0 :: mylist)
    println(1 :: 5 :: 9 :: Nil)
    println(mylist.head)
    /* tail is everything except header */
    println(names.tail)
    println(names.isEmpty)

    println(List.fill(5)(2))

    /* to iterate */
    mylist.foreach(println)
    var sum : Int =0
    mylist.foreach(sum += _)
    println(sum)


    for(name <- names){
      println(name);
    }

    println(names(0))
  }

}
