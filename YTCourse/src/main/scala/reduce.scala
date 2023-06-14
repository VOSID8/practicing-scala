/* Scala- Reduce, fold or scan (Left/Right)
reduceLeft, reduceRight, foldLeft, foldRight
scanLeft,scanRight
 */
object reduce {
  val lst = List(1,2,3,5,7,10,13)
  val lst2= List("A","B","C")

  def main(args: Array[String]): Unit ={
    println(lst.reduceLeft(_+_))
    println(lst2.reduceLeft(_+_))
    /*Vo reduce to left ker rha hai
    left side ke x me add kre ja rha hai
    y ko moving left
     */
    println(lst.reduceLeft((x,y) => {println(x + " ,"+y);x+y}))
    println(lst2.reduceRight(_+_))

    println(lst.reduceLeft(_-_))
    println(lst.reduceRight(_-_))

    /* we give initial value in fold methods */
    println(lst.foldLeft(100)(_+_))

    println(lst.scanLeft(100)(_+_))
    /* scanleft will you give a map */
    println(lst2.scanLeft("z")(_+_))


  }

}
