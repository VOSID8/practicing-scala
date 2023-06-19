

object L10Generics extends App{
  class MyList[+A] { //generic class
    //use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Dog = Animal
     */
  }
  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal
  //list of cats extends list of animals?
  //1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat //polymorphism (widening) => animal 
  //cats are animals right
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ??? HARD QUESTION. => we return a list of animals
  //we return a list of animals, so we can add a dog to it. Tech implemented in the class

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
  //val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat] //error

  //3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal] //error
  //this does not makes sense

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal] //this makes sense
  //all the animal trainers can train cats too

  //bounded types
  class Cage[A <: Animal](animal: A) //class Cage only accepts type parameters which are subtypes of Animal
  val cage = new Cage(new Dog) //we have done class Dog extends Animal upper
  //this is subtype
  class Car
  //val newCage = new Cage(new Car) //error

  //expand MyList to be generic
  


}
