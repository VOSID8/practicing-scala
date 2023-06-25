
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

    val f = sum(10,_,_ :Int)    // _ is a placeholder
    //here we are passing 10 as a and _ as b and _ as c
    //what is it doing? it is returning a function
    //f is a function that takes 2 parameters
    //f is a function that takes 2 parameters and returns an int

    println(f(30,200))

    val date = new Date;
    val newLog = log(date,_:String);
    newLog("The message 1")
    newLog("The message 3")
    newLog("The message 6")
    newLog("The message 7")


  }

}
