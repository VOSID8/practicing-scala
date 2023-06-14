object L6CBNvsCBV extends App {
  
    def calledByValue(x: Long): Unit = {
        println("by value: " + x) // this will print the same value twice
        println("by value: " + x) // because the value of x is passed to the function
    }

    def calledByName(x: => Long): Unit = {
        println("by name: " + x) // this will print different values
        println("by name: " + x) // because the expression is passed to the function
    }

    calledByValue(System.nanoTime())
    calledByName(System.nanoTime())

    def infinite(): Int = 1 + infinite() // this will crash with stackoverflow error
    def printFirst(x: Int, y: => Int) = println(x) // this will not crash
    // because the second parameter is passed by name
    // and it is not evaluated until it is used
    
    // printFirst(infinite(), 34) // this will crash
    printFirst(34, infinite()) // this will not crash 
    // because the second parameter is passed by name
    // and it is not evaluated until it is used as lazy evaluation

}
