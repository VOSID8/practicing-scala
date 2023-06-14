
class hi(var name: String,var age:Int){
  def this(){
    this("Tom",32)
  }

  def this(name:String){
    this(name,32)
  }
}

object hey{
  def main(args: Array[String]): Unit ={
    var user2=new hi()
    var user3=new hi("Max")
  }
}
