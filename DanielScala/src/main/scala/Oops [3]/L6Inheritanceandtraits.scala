object L6Inheritanceandtraits extends App {
  
    class Animal {
      val creatureType = "wild"
      val creatureType2 = "wild" //final keyword prevents overriding
      final val creatureType1 = "wild" //final keyword prevents overriding
      def eat = println("nomnom")
    }
    //single class inheritance
    class cat extends Animal {
      def crunch = {
        eat //inherited
        println("crunch crunch")
      }
    }
    val cat = new cat //cat is an animal
    cat.eat

    class Person(name: String, age: Int)
    class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
    //specified constructor of Person class as I extends Person class

    //overriding
    class Dog(override val creatureType: String) extends Animal {
      //override val in constructor is optional if we are overriding
      //override val creatureType = "domestic"
      override def eat = {
        super.eat //super is used to call parent class method
        println("BAWAWHAWHHW")
      }
    }
    val dog = new Dog("K9")
    dog.eat
    println(dog.creatureType)


    //type substitution (polymorphism)
    val unknownAnimal: Animal = new Dog("K9")
    //this happens because of polymorphism 
    //it goes to the most overridden version of the method
    //in this case it goes to the dog class eat method not animal class eat method
    //even though unknownAnimal is of type Animal
    unknownAnimal.eat //calls dog eat method

    //overRIDING vs overLOADING
    //overriding = supplying different implementation in derived classes
    //overloading = supply multiple methods with different signatures

    //final 
    //final keyword on member prevents it from being overridden
    //final keyword on class prevents it from being inherited/extended
    //sealed the class = extend classes in THIS FILE, prevent extension in other files
}
