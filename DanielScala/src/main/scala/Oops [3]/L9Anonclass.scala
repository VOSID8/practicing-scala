object L9Anonclass extends App {
  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahahaah")
  }
  /*
    equivalent with

    class AnonymousClasses$$anon$1 extends Animal {
      override def eat: Unit = println("ahahahahahaah")
    }
    val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
    // sayHi is a method of the class Person 
  }

  val jim = new Person("Sam") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }

  println(jim.sayHi) // Hi, my name is Jim, how can I be of service?
}
