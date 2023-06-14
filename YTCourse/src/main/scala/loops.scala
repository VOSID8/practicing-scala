object loops {
  def main(args: Array[String]): Unit ={
    for(i <- 1 to 5){
      println("i using to "+i);
    }
    for(i <- 1 until 3){
      println("--"+i+"--")
    }
    for(i <- 1.to(5)){
      println("::"+i+"::")
    }
    /* nested loop */
    for(i <-1 to 9; j <- 1 to 3){
      println("i and j are: "+i+" "+j)
    }

    val lst = List(1,2,3,4,5,6)

    for(i <-lst){
      println("i using lst "+i)
    }

    for (i <- lst; if i<6) {
      println("i using filters " + i)
    }

    val result = for {i <- lst; if i < 6}yield{
      i * i
    }
    println("result= "+result);

  }

}
