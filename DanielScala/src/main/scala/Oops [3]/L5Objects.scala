object L5Objects extends App{
  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { //type + its only instance... singleton
    //static/class-level functionality
    val N_EYES = 2 //class level functionality (static)
                   //does not exist in Scala. Object for class level functionality
    def canFly: Boolean = false
    //val var methods can be inside objects
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String = "Bobbie"){
    //instance-level functionality

  }

  println(Person.N_EYES)
  println(Person.canFly)
  val mary = new Person
  val john = new Person
  println(mary == john) //false

  val Person1 = Person //idher we points to the same instance the object singleton
    val Person2 = Person
    println(Person1 == Person2) //true
  val bobbie = Person(mary, john) //factory method from object apply use kra
  val bobbie2 = Person.apply(mary, john) 

  //Scala Applications = Scala object with
  //def main(args: Array[String]): Unit
}
