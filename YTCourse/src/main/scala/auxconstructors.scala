
class hi(var name: String,var age:Int){
  def this(){
    this("Tom",32)
  }

  def apply(): Unit = println("Hey")

  def this(name:String){
    this(name,32)
  }
}

object hey extends App{
    var user2=new hi()
    val user = new hi("Max", 28)
    println(user2())
    var user3=new hi("Max")
    println(user2.name) //Tom
}
