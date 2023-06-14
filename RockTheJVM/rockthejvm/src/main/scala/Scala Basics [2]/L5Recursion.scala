import scala.annotation.tailrec
object L5Recursion extends App{
  
    def factorial(n: Int): Int = 
        if(n <=0) 1
        else{
            println("Computing factorial of " +
             n + " - I first need factorial of " + (n-1))
             return n*factorial(n-1) // stack frame is created for each recursive call

        }
    println(factorial(10))
    // println(factorial(5000)) // this will crash with stackoverflow error

    def anotherFactorial(n: Int): BigInt = {
        @tailrec // this is an annotation to tell the compiler that this is a tail recursive function
        def factHelper(x:Int, accumulator: BigInt): BigInt =  
            if(x <= 1) accumulator
            else factHelper(x-1, x*accumulator) // TAIL RECURSION = use recursive call as the LAST expression
            // this is a TAIL RECURSIVE function as the recursive call is the last expression
            // this will not crash with stackoverflow error


        factHelper(n, 1) // this is the first call
        // this is a TAIL RECURSIVE function
        // Goes like this:
        // factHelper(10, 1)
        // factHelper(9, 10*1)
        // factHelper(8, 9*10*1)
    }

    // when you need loops, use tail recursion

    // 1) Concatenate a string n times
    def concatenateTailRec(aString: String, n: Int, accumulator: String): String = 
        if(n <= 0) accumulator
        else concatenateTailRec(aString, n-1, aString + accumulator)

    println(concatenateTailRec("hello", 3, "")) 

    // 2) IsPrime function tail recursive
    def prime(n:Int): Boolean = {
        @tailrec
        def isPrimeTailRec(t:Int, isStillPrime: Boolean): Boolean =
            if(!isStillPrime) false
            else if(t <=1) true
            else isPrimeTailRec(t-1, n%t != 0 && isStillPrime) 
        isPrimeTailRec(n/2, true) // this is the first call
    }
    println(prime(2003))
    println(prime(629))

    // 3) Fibonacci function, tail recursive

    def fibonacci(n:Int): Int={
        @tailrec
        def fiboTailRec(i:Int, last: Int, nextToLast: Int): Int = 
            if(i >= n) last // this is the last call
            else fiboTailRec(i+1, last + nextToLast, last) // TAIL RECURSION
        if(n <= 2) 1 // this is the first call
        else fiboTailRec(2, 1, 1) // this is the first call
    }


}


