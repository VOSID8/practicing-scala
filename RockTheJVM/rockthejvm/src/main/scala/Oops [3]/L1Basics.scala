object L1Basics extends App {
   val person = new Person("John", 26)
   val person1 = new Person1("Sam",56)
   println(person) // Result: Person@1b6d3586
    // this is a class instance
    println(person1.age) // Result: 0
    //println(person.age) class parameters are not fields
    person1.greet("Daniel")
    person1.greet()
}
class Person(name: String, age: Int) // this is a constructor which goes inside
class Person1(name: String, val age: Int){
    //body
    val x = 2 // this is a field
    println(1 + 3) // this is a side effect
    //side effect is an expression which returns unit
    //unit is a type which has only one value which is ()
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
    //this is a method which returns unit which is a side effect
    def greet(): Unit = println(s"Hi, I am $name") 
    //isme name humesahe hii Sam rhega
} //val makes age a field