/* difference between set and
list is that set cannot have duplicate values
 */

object sets {
  val mylist: List[Int] = List(1,2,3,4,5,6,6,6)
  val myset: Set[Int] = Set(1,2,3,4,5,6,6,6,6)
  val myset2: Set[Int] = Set(4,5,6)
  /*by default Sets are immutable
  but to make it mutable use


  val myset2: Set[Int] = scala.collection.mutable.Set(1,2,3,4,5,6,7,8,7,7); */
  val names: List[String] = List("Max","Tom","John")

  def main(args: Array[String]): Unit ={
    println(myset + 10) //adding an element to the set
    /* sets are not ordered ---> You cannot order them */
    println(myset)
    println(mylist)
    /*check if that element is present */
    println(myset(3))
    println(myset.head)
    println(myset.tail)
    println(myset.isEmpty)

    println(myset ++ myset2)
    println(myset.++(myset2))
    println(myset.&(myset2)) //intersection
    println(myset.intersect(myset2))
    println(myset.max) 

    myset.foreach(println)
    for(name <- names){
      println(name)
    }
  }

}
