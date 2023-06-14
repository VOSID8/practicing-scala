import java.util.Date
object PartialorderFunctions {

  def log(date: Date, message: String): Unit ={
    println(date + "  " +message)
  }

  def main(args: Array[String]): Unit ={
    /* fully applied function */
    val sum = (a:Int,b:Int,c:Int) => a+b+c
    println(sum(10,20,30));
    /*partial applied function */

    val f = sum(10,_,_ :Int)
    println(f(30,200))

    val date = new Date;
    val newLog = log(date,_:String);
    newLog("The message 1")
    newLog("The message 3")
    newLog("The message 6")
    newLog("The message 7")


  }

}
