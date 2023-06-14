object L8StringsOps extends App {
    val str: String = "Hello, I am learning Scala"

    println(str.charAt(2)) // l
    println(str.substring(7, 11)) // I am 
    println(str.split(" ").toList) // List(Hello,, I, am, learning, Scala)
    println(str.startsWith("Hello")) // true
    println(str.replace(" ", "-")) // Hello,-I-am-learning-Scala
    println(str.toLowerCase()) // hello, i am learning scala
    println(str.length) // 26

    val aNumberString = "45"
    val aNumber = aNumberString.toInt
    println('a' +: aNumberString :+ 'z') // a45z
    // +: prepending operator and :+ appending operator
    println(str.reverse) // alacS gninrael ma I ,olleH
    println(str.take(2)) // He
    val name = "David"
    val age = 12
    val greeting = s"Hello, my name is $name and I am $age years old"
    val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"
    println(anotherGreeting) // Hello, my name is David and I will be turning 13 years old

    val speed = 1.2f // f for float
    val myth = f"$name can eat $speed%2.2f burgers per minute"
    println(myth) // David can eat 1.20 burgers per minute

    // raw-interpolated
    println(raw"This is a \n newline") // This is a \n newline
    val escaped = "This is a \n newline"
    println(raw"$escaped") // This is a 
                           // newline
    //it is injected as a string, not as a newline



}
