object L10CaseClasses {
  /*
    equals, hashCode, toString
   */
  case class Person(name: String, age: Int)
  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name) // Jim 
  //name is a field of the class Person, so we can access it directly now
  // 2. sensible toString
  // println(instance) = println(instance.toString) //syntactic sugar
  println(jim.toString) //Person(Jim,34)
  println(jim) //Person(Jim,34)

  // 3. equals and hashCode implemented OOTB (out of the box)
  val jim2 = new Person("Jim", 34)
  println(jim == jim2) //true
  //case classes have the equals method implemented OOTB

  // 4. Case Classes have handy copy method
  val jim3 = jim.copy(age = 45) //copy method is used to create a new instance of the class
  //with the same values as the original instance, except for the values that we pass as parameters
  //in this case, we are creating a new instance of the class Person with the same name as jim
  //but with age = 45

  // 5. Case Classes have companion objects
  val thePerson = Person //thePerson is a companion object of the class Person 
  val mary = Person("Mary", 23) //we can instantiate a case class without using the keyword new
  //this is possible because the compiler will look for a companion object of the class Person

  // 6. Case Classes are serializable
  //Akka framework uses this feature to serialize messages and send them through the network

  // 7. Case Classes have extractor patterns = Case Classes can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

}
