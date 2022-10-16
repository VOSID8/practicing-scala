
class User(var name: String,var age:Int){
  def this(){
    this("Tom",32)
  }

  def this(name:String){
    this(name,32)
  }
}

object Demo{
  def main(args: Array[String]): Unit ={
    var user2=new User()
    var user3=new User("Max")
  }
}
