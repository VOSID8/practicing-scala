object ifelse {
  def main(args: Array[String]){
    val x=20;
    var y=30;
    var res = "";
    if(x == 20 && y==30){
      println("x is 20")
      res = "x is 20 using res";
    }
    else {
      println("x is not 20")
      res = "x is 20 using res";
    }
    println(res)
    val res2 = if (x==20) "x is 20 again" else "x is not 20 again"
    println(res2)

  }


}
