object L9Generics {
  class MyList[+A]{
    // use the type A
    def add(element: A): MyList[A] = ???
    def add[B >: A](element: B): MyList[B] = ???
  }
  class MyMap[Key, Value]{
    // use the type Key and Value
  }
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]
  // variance problem
  class Animal // Animal is a super class of Cat
  class Cat extends Animal
  class Dog extends Animal
  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION => we return a list of animals
  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
  // you cant do val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]
  // 3. Hell, no = CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  //what happened here? we can add a dog to the list of cats because it is a list of animals
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]
  //right side can train cats too 
  //bounded types
  class Cage[A <: Animal](animal: A) // class Cage only accepts subtypes of Animal
  val cage = new Cage(new Dog)
  //val cage = new Cage(new Car) // this will not work
  class Cage[A >: Animal](animal: A) // class Cage only accepts supertypes of Animal

  
}
