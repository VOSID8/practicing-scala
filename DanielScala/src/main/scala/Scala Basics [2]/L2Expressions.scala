

object Expressions extends App {

    val x = 1 + 2 // EXPRESSION
    println(x)

    println(2 + 3 * 4)
    // + - * / & | ^ << >> >>> (right shift with zero extension)
    //these are few expressions

    println(1 == x)
    // == != > >= < <= these are expressions where we compare values

    println(!(1 == x)) // ! && || these are expressions
    var aVariable = 2
    aVariable += 3 // also works with -= *= /= ..... side effects are expressions returning unit
    println(aVariable)

    // Instructions (DO) vs Expressions (VALUE) in Scala
    val aCondition = true
    val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
    println(aConditionedValue)
    println(if(aCondition) 5 else 3)
    println(1 + 3) // this is an expression
    // in scala we think in terms of expressions

    var i = 0
    while(i < 10) {
        println(i)
        i += 1
    }
    // NEVER WRITE THIS AGAIN LOOPS 
    val aWeirdValue = (aVariable = 3) // Unit === void
    println(aWeirdValue)
    // side effects in scala are expressions returning unit

    // code blocks
    val aCodeBlock = {
        val y = 2
        val z = y + 1

        if(z > 2) "hello" else "goodbye"
        //stuff inside codeblock is not visible outside
    }
    // code blocks are expressions

    // 1. difference between "hello world" vs println("hello world")?
    // "hello world" is a string literal of type string
    // println("hello world") is an expression of type unit which is a side effect

    // 2. what is the value of
    val someValue = {
        2 < 3
    }
    // true
    
    val someOtherValue = {
        if(someValue) 239 else 986
        42
    }
    // 42


}