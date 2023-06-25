object L3MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    //you can even use + operator instead of hangoutwith
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true 
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
  }
  //difference between method and function is that function can be called without an instance of a class 
  //but method can be called only with an instance of a class

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception")) // this is a normal method cal
  //likes is a method of the class Person
  //infix notation = operator notation (syntactic sugar)
  println(mary likes "Inception") // this is infix notation
  // infix notation works only with methods which have one parameter
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom) //result: Mary is hanging out with Tom
  //syntactic sugar works with methods with no parameters also
  //baically beautifying the code
  println(1 + 2)
  println(1.+(2)) // both are same
  // all mathematical operators are methods
  val x = -1 //unary operators are also methods works with - + ~ !
  val y = 1.unary_- //both are same
  println(!mary) // this is a prefix notation (syntactic sugar) for mary.unary_!
  println(mary.unary_!) // both are same
  println(mary.isAlive)
  //println(mary isAlive) // we use postfix notation (syntactic sugar) 
                         //for methods with no parameters
  println(mary.apply())
  println(mary()) // both are same
    // when you call an object like a function, it calls the apply method



}
