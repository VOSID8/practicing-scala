object L4MethodNotationsExercise extends App {
  //1) Overload the + operator
  // mary + "the rockstar" => new person "Mary (the rockstar)"
  class Person(val name: String, favouriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(nickname: String) = new Person(s"$name($nickname)", favouriteMovie)
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def liking(name: String): String = s"${this.name} likes $favouriteMovie and $name"
    def learns(): String = s"$name learns Scala"
  }
  val mary = new Person("Mary", "Inception")
  println((mary + "the rockstar").liking("Joe"))
  //yeh wali println bohot saare topics cover ker rhi

    //2) Add an age to the Person class
    // Add a unary + operator => new person with the age + 1
    // +mary => mary with the age incrementer

  println((mary + "the rockstar").age ) //0
  println((+mary).age) //1
  println(mary learns) //Mary learns Scala

  //3) Add a "learns" method in the Person class => "Mary learns Scala"
}



