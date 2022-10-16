
/* var ya val daalna zroori hai
*  var se getter aur setter dono avaiable
* val se only getter
* by default se dono nhi
* aur private kerne se class ke bahar cant use*/

class User(var name: String,var age:Int){
  def printName: Unit ={println(name)}
}

object Demo{
  def main(args: Array[String]): Unit ={
    var user=new User("Max",28)
    println(user.printName)
    println(user.age)
    /* pvt hai toh cant use
    user.name = "Tom"
     */
    user.age = 34
    /* Tum override ker stke ho */ 
    println(user.name)
    println(user.age)
  }
}
