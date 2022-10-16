
class strict{
  val e={
    println("Strict")
  }
}

class LazyEval{
  lazy val l={
    println("lazy")
  }
}
object lazyeval {
  def main(args: Array[String]): Unit ={
    val x = new strict
    val y = new LazyEval

    println(x.e)
    println(y.l)

  }

}
