
object L1 extends App {

    val random = new Random()
    val x = random.nextInt(10) // 0-9
    //nextInt is a method of the Random class and it returns an integer between 0 and 10

    val description = x match {
        case 1 => "the ONE"
        case 2 => "double or nothing"
        case 3 => "third time is the charm"
        case _ => "something else" // _ = WILDCARD
    } // this is a pattern matching expression
    println(x + " " + description)

    // 1. Decompose values
    case class Person(name: String, age: Int)
    val bob = Person("Bob", 20) // Person.apply("Bob", 20)

    val greeting = bob match {
        //case class Person(name: String, age: Int) // case classes are special
        //decompose ker diya

        case Person(n, a) if a < 21 => s"Hi, my name is $n and I am $a years old. I am not allowed to drink in the US"
        case Person(n, a) => s"Hi, my name is $n and I am $a years old. I am allowed to drink in the US"
        case _ => "I don't know who I am"
    }

    // 1. cases are matched in order
    // 2. what if no cases match? MatchError
    // 3. type of the PM expression? unified type of all the types in all the cases which is the lowest common ancestor
    // 4. PM works really well with case classes*

    // PM on sealed hierarchies
    sealed class Animal
    case class Dog(breed: String) extends Animal
    case class Parrot(greeting: String) extends Animal

    val animal: Animal = Dog("Terra Nova")
    animal match {
        case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
    }

    val isEven = x match {
        case n if n % 2 == 0 => true
        case _ => false
    }

    trait Expr
    case class Number(n: Int) extends Expr
    case class Sum(e1: Expr, e2: Expr) extends Expr
    case class Prod(e1: Expr, e2: Expr) extends Expr

    def show(e: Expr): String = e match {
        case Number(n) => s"$n"
        case Sum(e1, e2) => show(e1) + " + " + show(e2)
        case Prod(e1, e2) => {
            def maybeShowParentheses(exp: Expr) = exp match {
                case Prod(_, _) => show(exp) // if exp is a product, then no need to show parentheses
                case Number(_) => show(exp) // if exp is a number, then no need to show parentheses
                case _ => "(" + show(exp) + ")" // anything else, then we need to show parentheses
            }
            maybeShowParentheses(e1) + " * " + maybeShowParentheses(e2)
        }
    }

    println(show(Sum(Number(2), Number(3)))) // 2 + 3
    println(show(Sum(Number(2), Sum(Number(3), Number(4))))) // 2 + 3 + 4
    println(show(Prod(Sum(Number(2), Number(1)), Number(3)))) // (2 + 1) * 3
    println(show(Sum(Prod(Number(2), Number(1)), Number(3)))) // 2 * 1 + 3


}
