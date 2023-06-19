object L7Inheritance2 extends App {
    abstract class Animal {
      val creatureType: String
      def eat: Unit
    }

    class Dog extends Animal {
      val creatureType: String = "Canine"
      def eat: Unit = println("crunch crunch") //override keyword is optional
    }

    //traits
    trait Carnivore {
      def eat(animal: Animal): Unit
      val preferredMeal: String = "fresh meat"
      val creatureType: String = "Test"
    }
    //traits can be inherited along with class 
    //multiple traits can be inherited 
    //traits are behavior, abstract class is "thing"
    class Crocodile extends Animal with Carnivore {
      //idher ager override keyword nahi lagaya toh error aayega
      //traits can have abstract and non abstract members
      //traits do not have constructor parameters
      //trait me declare kra hua hai creatureType toh override keyword lagana padega
      //same does not goes for abstract class
      override val creatureType: String = "croc"
      def eat: Unit = println("nomnomnom")
      def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
    }


    val dog = new Dog
    val croc = new Crocodile
    println(croc.creatureType) //croc
    croc.eat(dog) //I'm a croc and I'm eating Canine
    //dog got called and passed as parameter to croc eat method

    //traits vs abstract classes
    //1 - traits do not have constructor parameters
    //2 - multiple traits may be inherited by the same class
    //3 - traits = behavior, abstract class = "thing"
    

}
